/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.module.pharmacyapi.api.model.Dispensation;

/**
 * @author Stélio Moiane
 *
 */
public interface DispensationService {

	Dispensation dispense(final Dispensation dispensation);
}
