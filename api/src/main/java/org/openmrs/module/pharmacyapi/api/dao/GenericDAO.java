/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.dao;

import org.openmrs.api.db.hibernate.DbSession;

/**
 * @author Stélio Moiane
 */
public interface GenericDAO<T> {
	
	DbSession getSession();
	
	T save(T entity);
}
