/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.util.List;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Drug;

/**
 * @author Guimino Neves
 */
public class DrugRegimen extends BaseOpenmrsData {
	
	private Integer drugRegimenId;
	
	private Drug drug;
	
	List<DrugGroup> drugGroups;
	
	@Override
	public Integer getId() {
		
		return this.drugRegimenId;
	}
	
	@Override
	public void setId(final Integer drugRegimenId) {
		this.drugRegimenId = drugRegimenId;
	}
	
	public Drug getDrug() {
		return this.drug;
	}
	
	public void setDrug(final Drug drug) {
		this.drug = drug;
	}
	
	public List<DrugGroup> getDrugGroups() {
		return this.drugGroups;
	}
	
	public void setDrugGroups(final List<DrugGroup> drugGroups) {
		this.drugGroups = drugGroups;
	}
}
