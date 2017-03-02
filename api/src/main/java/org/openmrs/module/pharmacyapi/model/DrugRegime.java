/**
 * 
 */
package org.openmrs.module.pharmacyapi.model;

import java.io.Serializable;
import java.util.List;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Drug;

/**
 * @author Guimino Neves
 *
 */
public class DrugRegime extends BaseOpenmrsData implements Serializable {

	private static final long serialVersionUID = 3987735186616581228L;

	private Integer drugRegimeId;

	private Drug drug;
	List<DrugGroup> drugGroups;

	@Override
	public Integer getId() {

		return this.drugRegimeId;
	}

	@Override
	public void setId(Integer drugRegimeId) {
		this.drugRegimeId = drugRegimeId;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public List<DrugGroup> getDrugGroups() {
		return drugGroups;
	}

	public void setDrugGroups(List<DrugGroup> drugGroups) {
		this.drugGroups = drugGroups;
	}
}
