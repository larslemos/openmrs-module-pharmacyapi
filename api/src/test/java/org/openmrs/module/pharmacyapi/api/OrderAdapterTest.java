/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.Encounter;
import org.openmrs.Order;
import org.openmrs.Patient;
import org.openmrs.module.pharmacyapi.api.templates.EncounterProcessor;
import org.openmrs.module.pharmacyapi.api.templates.EncounterTemplate;
import org.openmrs.module.pharmacyapi.api.templates.PatientTemplate;
import org.openmrs.module.pharmacyapi.api.util.BaseTest;
import org.openmrs.module.pharmacyapi.api.util.EntityFactory;

/**
 * @author Stélio Moiane
 */
public class OrderAdapterTest extends BaseTest {
	
	private ObsOrderAdapter orderAdapter;
	
	@Before
	public void setUp() {
		this.orderAdapter = new ObsOrderAdapter();
	}
	
	@Test
	public void shouldAdaptObsToOrders() {
		
		final Patient patient = EntityFactory.gimme(Patient.class, PatientTemplate.VALID);
		
		final Encounter lastEncounterWithObs = EntityFactory.gimme(Encounter.class, EncounterTemplate.VALID,
		    new EncounterProcessor());
		
		assertEquals(14, lastEncounterWithObs.getAllObs().size());
		
		final List<Order> orders = this.orderAdapter.adaptPatientObsPrescriptionToOrders(patient, lastEncounterWithObs);
		
		assertFalse(orders.isEmpty());
		
		assertEquals(1, orders.size());
	}
}
