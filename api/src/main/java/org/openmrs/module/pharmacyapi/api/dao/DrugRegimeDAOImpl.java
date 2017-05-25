/**
 *
 */
package org.openmrs.module.pharmacyapi.api.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Concept;
import org.openmrs.module.pharmacyapi.api.model.DrugRegime;

/**
 *
 */
public class DrugRegimeDAOImpl implements DrugRegimeDAO {
	
	private SessionFactory sessionFactory;
	
	@Override
	public void setSessionFactory(final SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DrugRegime> findByRegime(final Concept regime, final boolean retired) {
		
		final Query query = this.sessionFactory.getCurrentSession().getNamedQuery(DrugRegimeDAO.QUERY_NAME.findByRegime)
		        .setParameter("regime", regime).setParameter("retired", retired);
		
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DrugRegime> findAll(final boolean retired) {
		
		final Criteria searchCriteria = this.sessionFactory.getCurrentSession().createCriteria(DrugRegime.class,
		    "drugRegime");
		
		if (!retired) {
			searchCriteria.add(Restrictions.eq("drugRegime.retired", false));
		}
		return searchCriteria.list();
	}
	
	@Override
	public DrugRegime findByUuid(final String uuid) {
		
		return (DrugRegime) this.sessionFactory.getCurrentSession().createQuery("from DrugRegime dr where dr.uuid = :uuid")
		        .setString("uuid", uuid).uniqueResult();
	}
}
