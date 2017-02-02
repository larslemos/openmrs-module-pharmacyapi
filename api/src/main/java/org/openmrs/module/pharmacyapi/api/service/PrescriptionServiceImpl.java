/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.service;

import java.util.Arrays;
import java.util.List;

import org.openmrs.CareSetting;
import org.openmrs.Concept;
import org.openmrs.Drug;
import org.openmrs.DrugOrder;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Order;
import org.openmrs.OrderFrequency;
import org.openmrs.OrderType;
import org.openmrs.Patient;
import org.openmrs.Person;
import org.openmrs.Provider;
import org.openmrs.api.AmbiguousOrderException;
import org.openmrs.api.OrderService;
import org.openmrs.api.context.Context;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharmacyapi.api.adapter.ObsOrderAdapter;
import org.openmrs.module.pharmacyapi.api.util.MappedConcepts;
import org.openmrs.module.pharmacyapi.api.util.MappedOrders;

/**
 * @author Stélio Moiane
 */
public class PrescriptionServiceImpl extends BaseOpenmrsService implements PrescriptionService {
	
	private ObsOrderAdapter obsOrderAdapter;
	
	@Override
	public void parseObsToOrders(final Patient patient) {
		
		final Encounter lastEncounter = this.getLastEncounter(patient);
		
		if (lastEncounter == null) {
			return;
		}
		
		final List<Order> orders = this.obsOrderAdapter.adaptPatientObsPrescriptionToOrders(patient, lastEncounter);
		
		this.saveOrders(orders, lastEncounter);
	}
	
	private void saveOrders(final List<Order> orders, final Encounter encounter) {
		
		final OrderService orderService = Context.getOrderService();
		
		for (Order order : orders) {
			
			if (order instanceof DrugOrder) {
				final OrderType orderType = orderService.getOrderTypeByUuid(MappedOrders.DRUG_ORDER);
				order.setOrderType(orderType);
				
				final OrderFrequency orderFrequency = orderService.getOrderFrequencyByConcept(((DrugOrder) order)
				        .getFrequency().getConcept());
				((DrugOrder) order).setFrequency(orderFrequency);
				
				Drug drug = ((DrugOrder) order).getDrug();
				
				final List<Drug> drugs = Context.getConceptService().getDrugsByConcept(drug.getConcept());
				
				if (!drugs.isEmpty()) {
					drug = drugs.get(0);
				} else {
					drug = Context.getConceptService().saveDrug(drug);
				}
				
				((DrugOrder) order).setDrug(drug);
			}
			
			order.setOrderer(this.getProvider(encounter));
			final CareSetting careSetting = orderService.getCareSettingByUuid(MappedOrders.CARE_SETTING_OUTPATIENT);
			order.setCareSetting(careSetting);
			
			try {
				order = orderService.saveOrder(order, null);
			}
			catch (final AmbiguousOrderException ex) {
				// There is an order with the same drug active
			}
		}
	}
	
	private Provider getProvider(final Encounter encounter) {
		return encounter.getEncounterProviders().iterator().next().getProvider();
	}
	
	private Encounter getLastEncounter(final Patient patient) {
		
		final Concept conceptConvSet = Context.getConceptService().getConceptByUuid(MappedConcepts.TREATMENT_PRESCRIBED_SET);
		
		// Gets the lastest observation conv set of the patient with a
		// prescription
		final List<Obs> observations = Context.getObsService().getObservations(Arrays.asList((Person) patient), null,
		    Arrays.asList(conceptConvSet), null, null, null, null, 1, null, null, null, false);
		
		if (observations.isEmpty()) {
			return null;
		}
		
		final Obs obsGroup = observations.get(0);
		
		return Context.getEncounterService().getEncounterByUuid(obsGroup.getEncounter().getUuid());
	}
	
	public void setObsOrderAdapter(final ObsOrderAdapter obsOrderAdapter) {
		this.obsOrderAdapter = obsOrderAdapter;
	}
}
