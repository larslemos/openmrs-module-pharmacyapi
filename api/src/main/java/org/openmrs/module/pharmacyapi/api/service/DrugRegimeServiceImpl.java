/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Concept;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharmacyapi.api.dao.DrugRegimeDAO;
import org.openmrs.module.pharmacyapi.api.model.DrugRegime;
import org.openmrs.module.pharmacyapi.db.DbSessionManager;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */
@Transactional
public class DrugRegimeServiceImpl extends BaseOpenmrsService implements DrugRegimeService {
	
	private DrugRegimeDAO drugRegimeDAO;
	
	private DbSessionManager dbSessionManager;
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	@Override
	public List<DrugRegime> findDrugRegimesByRegime(final Concept regime) {
		
		return this.drugRegimeDAO.findByRegime(regime, false);
	}
	
	@Override
	public void setDrugRegimeDAO(final DrugRegimeDAO drugRegimeDAO) {
		this.drugRegimeDAO = drugRegimeDAO;
	}
	
	@Override
	public void setDbSessionManager(final DbSessionManager dbSessionManager) {
		
		this.dbSessionManager = dbSessionManager;
	}
	
	@Override
	public List<DrugRegime> findAllDrugRegimes(final Boolean retired) {
		return this.drugRegimeDAO.findAll(retired);
	}
	
	@Override
	public DrugRegime findDrugRegimeByUuid(final String uuid) {
		
		return this.drugRegimeDAO.findByUuid(uuid);
	}
}
