/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;

/**
 * @author Stélio Moiane
 */
public interface PrescriptionService extends OpenmrsService {
	
	String NAME = "org.openmrs.module.pharmacyapi.service.PrescriptionService";
	
	void parseObsToOrders(final Patient patient);
}
