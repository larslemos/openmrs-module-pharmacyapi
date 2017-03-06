/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Concept;
import org.openmrs.Drug;
import org.openmrs.module.openhmis.inventory.api.model.Item;

/**
 * @author Guimino Neves
 */
@Entity
@Table(name = "phm_drug_items")
public class DrugItem extends BaseOpenmrsData {
	
	@Id
	@GeneratedValue
	@Column(name = "drug_item_id", nullable = false)
	private Integer drugItemId;
	
	@OneToOne
	@JoinColumn(name = "drug_id", nullable = false)
	private Drug drug;
	
	@OneToOne
	@JoinColumn(name = "item_id", nullable = false)
	private Item item;
	
	@ManyToOne
	@JoinColumn(name = "drug_units_id", nullable = false)
	private Concept drugUnits;
	
	@Column(name = "drug_unit_value", nullable = false)
	private Double drugUnitValue;
	
	@Column(name = "bar_code", length = 100)
	private String barCode;
	
	@Override
	public Integer getId() {
		
		return this.drugItemId;
	}
	
	@Override
	public void setId(final Integer drugItemId) {
		this.drugItemId = drugItemId;
	}
	
	public Drug getDrug() {
		return this.drug;
	}
	
	public void setDrug(final Drug drug) {
		this.drug = drug;
	}
	
	public Item getItem() {
		return this.item;
	}
	
	public void setItem(final Item item) {
		this.item = item;
	}
	
	public Integer getDrugItemId() {
		return this.drugItemId;
	}
	
	public void setDrugItemId(final Integer drugItemId) {
		this.drugItemId = drugItemId;
	}
	
	public Concept getDrugUnits() {
		return this.drugUnits;
	}
	
	public void setDrugUnits(final Concept drugUnits) {
		this.drugUnits = drugUnits;
	}
	
	public Double getDrugUnitValue() {
		return this.drugUnitValue;
	}
	
	public void setDrugUnitValue(final Double drugUnitValue) {
		this.drugUnitValue = drugUnitValue;
	}
	
	public String getBarCode() {
		return this.barCode;
	}
	
	public void setBarCode(final String barCode) {
		this.barCode = barCode;
	}
}
