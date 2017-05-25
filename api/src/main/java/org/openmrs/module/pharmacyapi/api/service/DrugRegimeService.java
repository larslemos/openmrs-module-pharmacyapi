/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.service;

import java.util.List;

import org.openmrs.Concept;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharmacyapi.api.dao.DrugRegimeDAO;
import org.openmrs.module.pharmacyapi.api.model.DrugRegime;

/**
 *
 */
public interface DrugRegimeService extends OpenmrsService {
	
	void setDrugRegimeDAO(DrugRegimeDAO drugRegimeDAO);
	
	List<DrugRegime> findDrugRegimesByRegime(Concept regime);
	
	List<DrugRegime> findAllDrugRegimes(Boolean retired);
	
	DrugRegime findDrugRegimeByUuid(String uuid);
}
