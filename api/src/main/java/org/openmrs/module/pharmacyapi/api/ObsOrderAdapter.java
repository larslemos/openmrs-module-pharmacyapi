package org.openmrs.module.pharmacyapi.api;

import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.DOSAGE_AMOUNT;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.DOSAGE_FREQUENCY;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.DOSING_UNITS;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.DRUG_ROUTES;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.DURATION;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.DURATION_UNITS;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.PREVIOUS_ANTIRETROVIRAL_DRUGS;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.TREATMENT_PRESCRIBED;
import static org.openmrs.module.pharmacyapi.api.util.MappedConcepts.TREATMENT_PRESCRIBED_SET;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openmrs.Drug;
import org.openmrs.DrugOrder;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Order;
import org.openmrs.OrderFrequency;
import org.openmrs.Patient;

;

public class ObsOrderAdapter {
	
	public List<Order> adaptPatientObsPrescriptionToOrders(final Patient patient, final Encounter encounter) {
		final List<Order> orders = new ArrayList<>();
		final List<Obs> convSetObservations = new ArrayList<>();

		final Set<Obs> allObservations = encounter.getObs();

		for (final Obs obs : allObservations) {

			if (this.isConSetObs(obs)) {
				convSetObservations.add(obs);
			}
		}

		if (!convSetObservations.isEmpty()) {

			for (final Obs convSetObservation : convSetObservations) {

				final Order order = this.prepareDrugOrder(convSetObservation, allObservations);
				orders.add(order);
			}
		}

		return orders;
	}
	
	private Order prepareDrugOrder(final Obs convSetObservation, final Set<Obs> allObservations) {
		
		final DrugOrder order = new DrugOrder();
		
		for (final Obs observation : allObservations) {
			
			if (this.isConvSetMember(convSetObservation, observation)) {
				
				if (DOSAGE_AMOUNT.equals(observation.getConcept().getUuid())) {
					order.setDose(observation.getValueNumeric());
					continue;
				}
				
				if (DOSING_UNITS.equals(observation.getConcept().getUuid())) {
					order.setDoseUnits(observation.getValueCoded());
					continue;
				}
				
				if (DOSAGE_FREQUENCY.equals(observation.getConcept().getUuid())) {
					final OrderFrequency orderFrequency = new OrderFrequency();
					orderFrequency.setConcept(observation.getValueCoded());
					order.setFrequency(orderFrequency);
					continue;
				}
				
				if (DURATION.equals(observation.getConcept().getUuid())) {
					order.setDuration(observation.getValueNumeric().intValue());
					continue;
				}
				
				if (DURATION_UNITS.equals(observation.getConcept().getUuid())) {
					order.setDurationUnits(observation.getValueCoded());
					continue;
				}
				
				if (DRUG_ROUTES.equals(observation.getConcept().getUuid())) {
					order.setRoute(observation.getValueCoded());
					continue;
				}
				
				if (PREVIOUS_ANTIRETROVIRAL_DRUGS.equals(observation.getConcept().getUuid())) {
					final Drug drug = new Drug();
					drug.setConcept(observation.getValueCoded());
					order.setDrug(drug);
					continue;
				}
				
				if (TREATMENT_PRESCRIBED.equals(observation.getConcept().getUuid())) {
					final Drug drug = new Drug();
					drug.setConcept(observation.getValueCoded());
					order.setDrug(drug);
					continue;
				}
			}
		}
		
		return order;
	}
	
	private boolean isConvSetMember(final Obs convSetObservation, final Obs observation) {
		return convSetObservation.getUuid().equals(observation.getObsGroup().getUuid());
	}
	
	private boolean isConSetObs(final Obs obs) {
		return TREATMENT_PRESCRIBED_SET.equals(obs.getConcept().getUuid());
	}
}
