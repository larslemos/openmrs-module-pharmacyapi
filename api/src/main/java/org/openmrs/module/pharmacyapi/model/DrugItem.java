/**
 * 
 */
package org.openmrs.module.pharmacyapi.model;

import java.io.Serializable;

import org.hibernate.search.annotations.DocumentId;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Concept;
import org.openmrs.Drug;
import org.openmrs.module.openhmis.inventory.api.model.Item;

/**
 * @author Guimino Neves
 *
 */
public class DrugItem extends BaseOpenmrsData implements Serializable {

	private static final long serialVersionUID = -5531298532579891142L;
	// Fields
	@DocumentId
	private Integer drugItemId;

	private Drug drug;
	private Item item;
	private Concept drugUnits;
	private Double drugUnitValue;
	private String barCode;

	@Override
	public Integer getId() {

		return drugItemId;
	}

	@Override
	public void setId(Integer drugItemId) {
		this.drugItemId = drugItemId;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getDrugItemId() {
		return drugItemId;
	}

	public void setDrugItemId(Integer drugItemId) {
		this.drugItemId = drugItemId;
	}

	public Concept getDrugUnits() {
		return drugUnits;
	}

	public void setDrugUnits(Concept drugUnits) {
		this.drugUnits = drugUnits;
	}

	public Double getDrugUnitValue() {
		return drugUnitValue;
	}

	public void setDrugUnitValue(Double drugUnitValue) {
		this.drugUnitValue = drugUnitValue;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

}
