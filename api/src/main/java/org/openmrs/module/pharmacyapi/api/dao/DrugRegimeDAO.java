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
	
	public interface QUERY_NAME {
		
		public static final String findByRegime = "DrugRegime.findByRegime";
	}
	
	public interface QUERY {
		
		public static final String findByRegime = "select distinct drugRegime from DrugRegime drugRegime join fetch drugRegime.drugItem join fetch drugRegime.regime where drugRegime.regime =:regime and drugRegime.retired = :retired";
	}
	
	void setSessionFactory(SessionFactory sessionFactory);
	
	List<DrugRegime> findByRegime(Concept regime, boolean retired);
	
	List<DrugRegime> findAll(boolean retired);
	
	DrugRegime findByUuid(String uuid);
	
}
