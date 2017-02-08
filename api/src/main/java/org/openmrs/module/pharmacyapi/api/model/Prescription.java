/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.io.Serializable;
import java.util.Date;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Order;

/**
 * @author Stélio Moiane This class is basically an order wrapper.
 */
public class Prescription extends BaseOpenmrsData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer prescriptionId;
	
	private Order order;
	
	private Double drugToPickUp;
	
	private Double drugPickedUp;
	
	private String dosingInstructions;
	
	private String provider;
	
	private Date prescriptionDate;
	
	private String conceptParentUuid;
	
	public Prescription(final Order order) {
		this.drugPickedUp = 0.0;
		this.drugToPickUp = 0.0;
		this.order = order;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
	public void setOrder(final Order order) {
		this.order = order;
	}
	
	public Double getDrugToPickUp() {
		return this.drugToPickUp;
	}
	
	public void setDrugToPickUp(final Double drugToPickUp) {
		this.drugToPickUp = drugToPickUp;
	}
	
	public Double getDrugPickedUp() {
		return this.drugPickedUp;
	}
	
	public void setDrugPickedUp(final Double drugPickedUp) {
		this.drugPickedUp = drugPickedUp;
	}
	
	@Override
	public Integer getId() {
		return this.prescriptionId;
	}
	
	@Override
	public void setId(final Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	
	public void setDosingInstructions(final String dosingInstructions) {
		this.dosingInstructions = dosingInstructions;
	}
	
	public String getDosingInstructions() {
		return this.dosingInstructions;
	}
	
	public String getProvider() {
		return this.provider;
	}
	
	public void setProvider(final String provider) {
		this.provider = provider;
	}
	
	public Date getPrescriptionDate() {
		return this.prescriptionDate;
	}
	
	public void setPrescriptionDate(final Date prescriptionDate) {
		this.prescriptionDate = prescriptionDate;
	}
	
	public void setConceptParentUuid(final String conceptParentUuid) {
		this.conceptParentUuid = conceptParentUuid;
	}
	
	public String getConceptParentUuid() {
		return this.conceptParentUuid;
	}
}
