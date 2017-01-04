/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Order;
import org.openmrs.Patient;

/**
 * @author Stélio Moiane
 *
 */
public class OrderAdapterTest {

	@Test
	public void shouldAdaptObsToOrders() {

		final ObsOrderAdapter orderAdapter = new ObsOrderAdapter();

		final Patient patient = new Patient();

		final Encounter encounter = new Encounter();

		final List<Obs> observations = new ArrayList<>();

		// // final List<Order> orders =
		// // orderAdapter.adaptPatientObsPrescriptionToOrders(patient,
		// encounter,
		// // observations);
		//
		// assertFalse(orders.isEmpty());
		//
		// for (final Order order : orders) {
		// assertEquals(patient.getUuid(), order.getPatient().getId());
		// }
	}
}
