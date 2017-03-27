/**
 * 
 *  UCSF -Global Programs 2017
 *  
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.Concept;
import org.openmrs.Drug;
import org.openmrs.module.pharmacyapi.api.model.stock.DrugMeasureUnit;

/**
 * @author Guimino Neves
 */
public class DrugItem extends BaseOpenmrsMetadata implements Serializable {

	private static final long serialVersionUID = -2778691803288646029L;

	private Integer drugItemId;

	private Drug drug;

	private Concept drugUnits;

	private Double drugUnitValue;

	private String barCode;

	private final Set<DrugMeasureUnit> measureUnits = new TreeSet<>();

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

	public Set<DrugMeasureUnit> getMeasureUnits() {
		return this.measureUnits;
	}
}
