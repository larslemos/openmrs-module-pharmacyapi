/**
 *
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.openmrs.Concept;
import org.openmrs.Drug;

@Entity
@Table(name = "phm_drug_regime")
public class DrugRegime extends BaseOpenmrsMetadataWrapper implements Serializable {
	
	private static final long serialVersionUID = -3770809635357840242L;
	
	@Id
	@GeneratedValue
	@Column(name = "drug_regime_id")
	private Integer drugRegimeId;
	
	@ManyToOne
	@JoinColumn(name = "regime_id")
	private Concept regime;
	
	@ManyToOne
	@JoinColumn(name = "drug_id")
	private Drug drug;
	
	public DrugRegime() {
	}
	
	@Override
	public Integer getId() {
		return this.drugRegimeId;
	}
	
	@Override
	public void setId(final Integer id) {
		this.drugRegimeId = id;
	}
	
	public Concept getRegime() {
		return this.regime;
	}
	
	public void setRegime(final Concept regime) {
		
		this.regime = regime;
	}
	
	public Drug getDrug() {
		return this.drug;
	}
	
	public void setDrug(final Drug drug) {
		
		this.drug = drug;
	}
	
}
