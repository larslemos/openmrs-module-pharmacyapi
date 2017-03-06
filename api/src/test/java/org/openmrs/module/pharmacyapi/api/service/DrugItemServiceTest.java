/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.openmrs.module.pharmacyapi.api.dao.DrugItemDAO;

/**
 * @author Stélio Moiane
 */
public class DrugItemServiceTest {
	
	private DrugItemDAO drugItemDAO;
	
	@Ignore
	@Test
	public void shouldSaveDrugItem() {
		assertNotNull(this.drugItemDAO);
	}
}
