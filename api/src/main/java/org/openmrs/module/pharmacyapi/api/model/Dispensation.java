/*
 * Friends in Global Health - FGH © 2017
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.io.Serializable;
import java.util.List;

import org.openmrs.BaseOpenmrsData;

/**
 * @author Stélio Moiane
 *
 */
public class Dispensation extends BaseOpenmrsData implements Serializable {

	private Integer dispensationId;

	private List<DispensationItem> dispensationItems;

	@Override
	public Integer getId() {
		return this.dispensationId;
	}

	@Override
	public void setId(final Integer dispensationId) {
		this.dispensationId = dispensationId;
	}

	public List<DispensationItem> getDispensationItems() {
		return this.dispensationItems;
	}

	public void setDispensationItems(final List<DispensationItem> dispensationItems) {
		this.dispensationItems = dispensationItems;
	}
}
