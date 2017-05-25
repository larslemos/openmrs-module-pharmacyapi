/**
 *
 */
package org.openmrs.module.pharmacyapi.api.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.openmrs.Concept;
import org.openmrs.module.pharmacyapi.api.model.DrugRegime;

/**
 *
 */
public interface DrugRegimeDAO {
	
	void setSessionFactory(SessionFactory sessionFactory);
	
	List<DrugRegime> findByRegime(Concept regime, boolean retired);
	
	List<DrugRegime> findAll(boolean retired);
	
	DrugRegime findByUuid(String uuid);
	
}
