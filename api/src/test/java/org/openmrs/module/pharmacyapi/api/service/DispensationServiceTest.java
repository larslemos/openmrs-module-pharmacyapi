/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharmacyapi.api.model.Dispensation;
import org.openmrs.module.pharmacyapi.api.templates.DispensationTemplate;
import org.openmrs.module.pharmacyapi.api.util.EntityFactory;

/**
 * @author Stélio Moiane
 */
public class DispensationServiceTest {

	private DispensationService dispensationService;

	@Before
	public void setUp() {
		Context.getService(DispensationService.class);
	}

	@Test
	public void shouldDispenseOrders() {

		final Dispensation dispensation = EntityFactory.gimme(Dispensation.class, DispensationTemplate.VALID);

		final Dispensation createdDispensation = this.dispensationService.dispense(dispensation);

		assertNotNull(createdDispensation);
	}
}
