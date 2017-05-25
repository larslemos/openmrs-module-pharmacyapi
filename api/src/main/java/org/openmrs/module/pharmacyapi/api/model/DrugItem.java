/**
 *
 *  UCSF -Global Programs 2017
 *
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.io.Serializable;

import javax.persistence.Column;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.Concept;
import org.openmrs.Drug;

/**
 * @author Guimino Neves
 */
public class DrugItem extends BaseOpenmrsMetadata implements Serializable {
	
	private static final long serialVersionUID = -2778691803288646029L;
	
	private Integer drugItemId;
	
	private Drug drug;
	
	@Column(name = "fnm_code")
	private String fnmCode;
	
	private Concept pharmaceuticalForm;
	
	private Concept therapeuticGroup;
	
	private Concept therapeuticClass;
	
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
	
	public String getFnmCode() {
		return this.fnmCode;
	}
	
	public void setFnmCode(final String fnmCode) {
		this.fnmCode = fnmCode;
	}
	
	public Concept getPharmaceuticalForm() {
		return this.pharmaceuticalForm;
	}
	
	public void setPharmaceuticalForm(final Concept pharmaceuticalForm) {
		this.pharmaceuticalForm = pharmaceuticalForm;
	}
	
	public Concept getTherapeuticGroup() {
		return this.therapeuticGroup;
	}
	
	public void setTherapeuticGroup(final Concept therapeuticGroup) {
		this.therapeuticGroup = therapeuticGroup;
	}
	
	public Concept getTherapeuticClass() {
		return this.therapeuticClass;
	}
	
	public void setTherapeuticClass(final Concept therapeuticClass) {
		this.therapeuticClass = therapeuticClass;
	}
	
	@Override
	public boolean equals(final Object obj) {
		
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof DrugItem) {
			final DrugItem other = (DrugItem) obj;
			return new EqualsBuilder().append(this.getDrug(), other.getDrug()).isEquals();
		}
		
		return false;
	}
}
