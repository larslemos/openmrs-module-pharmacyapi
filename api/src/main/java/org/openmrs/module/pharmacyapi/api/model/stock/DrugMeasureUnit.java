/**
 *
 */
package org.openmrs.module.pharmacyapi.api.model.stock;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.Concept;
import org.openmrs.module.pharmacyapi.api.model.DrugItem;

/**
 * @author Guimino Francisco Neves
 */
public class DrugMeasureUnit extends BaseOpenmrsMetadata implements Serializable {

	private static final long serialVersionUID = 8187765503126169282L;

	private Integer drugMeasureUnitId;

	private DrugItem drugItem;

	private Concept unity;

	private Double quantityPerUnit;

	@Override
	public Integer getId() {
		return this.drugMeasureUnitId;
	}

	@Override
	public void setId(final Integer id) {
		this.drugMeasureUnitId = id;
	}

	public Concept getUnity() {
		return this.unity;
	}

	public void setUnity(final Concept unity) {
		this.unity = unity;
	}

	public Double getQuantityPerUnit() {
		return this.quantityPerUnit;
	}

	public void setQuantityPerUnit(final Double quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public DrugItem getDrugItem() {
		return this.drugItem;
	}

	public void setDrugItem(final DrugItem drugItem) {
		this.drugItem = drugItem;
	}
}
