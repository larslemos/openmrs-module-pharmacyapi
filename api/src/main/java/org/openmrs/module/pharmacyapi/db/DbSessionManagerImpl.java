/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.db;

import org.hibernate.FlushMode;
import org.openmrs.api.db.hibernate.DbSessionFactory;

/**
 * @author Stélio Moiane
 */
public class DbSessionManagerImpl implements DbSessionManager {
	
	private DbSessionFactory dbSessionFactory;
	
	private FlushMode currentFlushMode;
	
	@Override
	public FlushMode getCurrentFlushMode() {
		return this.dbSessionFactory.getCurrentSession().getFlushMode();
	}
	
	@Override
	public void setManualFlushMode() {
		this.currentFlushMode = this.getCurrentFlushMode();
		this.dbSessionFactory.getCurrentSession().setFlushMode(FlushMode.MANUAL);
	}
	
	@Override
	public void setFlushMode(final FlushMode flushMode) {
		this.dbSessionFactory.getCurrentSession().setFlushMode(flushMode);
	}
	
	public void setSessionFactory(final DbSessionFactory sessionFactory) {
		this.dbSessionFactory = sessionFactory;
	}
	
	@Override
	public void setAutoFlushMode() {
		this.setFlushMode(this.currentFlushMode);
	}
}
