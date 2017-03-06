/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.dao;

import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;

/**
 * @author Stélio Moiane
 */
public interface GenericDAO<T> {
	
	DbSession getSession();
	
	void setSession(DbSessionFactory dbSessionFactory);
	
	T save(T entity);
}
