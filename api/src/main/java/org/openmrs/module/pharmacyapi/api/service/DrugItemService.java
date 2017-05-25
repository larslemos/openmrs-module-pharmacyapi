/**
 *
 * UCSF -Global Programs 2017
 *
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.api.OpenmrsService;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.pharmacyapi.api.model.DrugItem;

/**
 * @author Guimino Neves
 */
public interface DrugItemService extends OpenmrsService {
	
	void setSessionFactory(final DbSessionFactory dbSessionFactory);
	
	void save(DrugItem drugItem);
	
}
