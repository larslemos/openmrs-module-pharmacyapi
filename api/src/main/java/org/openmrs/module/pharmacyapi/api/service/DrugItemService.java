/**
 *
 * UCSF -Global Programs 2017
 *
 */
package org.openmrs.module.pharmacyapi.api.service;

import java.util.List;

import org.openmrs.api.OpenmrsService;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.pharmacyapi.api.model.DrugItem;

/**
 */
public interface DrugItemService extends OpenmrsService {
	
	void setSessionFactory(final DbSessionFactory dbSessionFactory);
	
	DrugItem findByUuid(String uuid);
	
	List<DrugItem> findAll(boolean retired);
	
	void save(DrugItem drugItem);
	
}
