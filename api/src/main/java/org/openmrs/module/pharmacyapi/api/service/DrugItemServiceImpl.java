package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharmacyapi.api.model.DrugItem;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 s *
 */

@Transactional
public class DrugItemServiceImpl extends BaseOpenmrsService implements DrugItemService {
	
	private DbSessionFactory sessionFactory;
	
	@Override
	public void save(final DrugItem drugItem) {
		
		this.sessionFactory.getCurrentSession().saveOrUpdate(drugItem);
	}
	
	@Override
	public void setSessionFactory(final DbSessionFactory dbSessionFactory) {
		this.sessionFactory = dbSessionFactory;
	}
	
}
