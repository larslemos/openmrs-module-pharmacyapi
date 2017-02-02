/*
 * Friends in Global Health - FGH © 2017
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.io.Serializable;
import java.util.Date;

import org.openmrs.BaseOpenmrsData;

/**
 * @author Stélio Moiane
 *
 */
public class DispensationItem extends BaseOpenmrsData implements Serializable {

	private Integer dispensationItemId;
	
	private String orderUuid;
	
	private double quantityDispensed;
	
	private Date dateOfNextPickUp;

	private static final long serialVersionUID = 1L;

	@Override
	public Integer getId() {
		return this.dispensationItemId;
	}

	@Override
	public void setId(final Integer dispensationItemId) {
		this.dispensationItemId = dispensationItemId;
	}
}
