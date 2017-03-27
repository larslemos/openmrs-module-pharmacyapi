/**
 *  UCSF -Global Programs 2017
 *
 */
package org.openmrs.module.pharmacyapi.api.model.stock;

import java.io.Serializable;
import java.util.Date;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.module.pharmacyapi.api.model.DrugItem;

/**
 * @author Guimino Neves
 */
public class Lot extends BaseOpenmrsMetadata implements Serializable {

	private static final long serialVersionUID = -8595553958148774238L;

	private Integer loteId;

	private String code;

	private DrugItem drugItem;

	private DrugMeasureUnit measureUnit;

	private Supplier provenance;

	private Date receptionDate;

	private Date expirationDate;

	private Date manufactureDate;

	@Override
	public Integer getId() {

		return this.loteId;
	}

	@Override
	public void setId(final Integer id) {
		this.loteId = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(final String code) {
		this.code = code;
	}

	public Date getReceptionDate() {
		return this.receptionDate;
	}

	public void setReceptionDate(final Date receptionDate) {
		this.receptionDate = receptionDate;
	}

	public Supplier getProvenance() {
		return this.provenance;
	}

	public void setProvenance(final Supplier provenance) {
		this.provenance = provenance;
	}

	public DrugItem getDrugItem() {
		return this.drugItem;
	}

	public void setDrugItem(final DrugItem drugItem) {
		this.drugItem = drugItem;
	}

	public Date getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(final Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(final Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public DrugMeasureUnit getMeasureUnit() {
		return this.measureUnit;
	}

	public void setMeasureUnit(final DrugMeasureUnit measureUnit) {
		this.measureUnit = measureUnit;
	}
}
