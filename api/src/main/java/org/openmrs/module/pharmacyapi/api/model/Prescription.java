/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Order;

/**
 * @author Stélio Moiane This class is basically an order wrapper.
 */
public class Prescription extends BaseOpenmrsData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer prescriptionId;
	
	private Order order;
	
	private int drugAmountToPickUp;
	
	public Prescription(final Order order) {
		this.order = order;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public void setOrder(final Order order) {
		this.order = order;
	}
	
	public int getDrugAmountToPickUp() {
		return this.drugAmountToPickUp;
	}
	
	public void setDrugAmountToPickUp(final int drugAmountToPickUp) {
		this.drugAmountToPickUp = drugAmountToPickUp;
	}
	
	@Override
	public Integer getId() {
		return this.prescriptionId;
	}
	
	@Override
	public void setId(final Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
}
