package org.openmrs.module.pharmacyapi.api.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharmacyapi.api.model.DrugItem;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *
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
	
	@Override
	public DrugItem findByUuid(final String uuid) {
		return (DrugItem) this.sessionFactory.getCurrentSession().createQuery("from DrugItem di where di.uuid = :uuid")
		        .setString("uuid", uuid).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DrugItem> findAll(final boolean retired) {
		final Criteria searchCriteria = this.sessionFactory.getCurrentSession().createCriteria(DrugItem.class, "drugItem");
		
		if (!retired) {
			searchCriteria.add(Restrictions.eq("drugItem.retired", false));
		}
		return searchCriteria.list();
	}
}
