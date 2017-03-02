/**
 * 
 */
package org.openmrs.module.pharmacyapi.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.search.annotations.DocumentId;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Drug;

/**
 * @author Guimino Neves
 *
 */
public class DrugGroup extends BaseOpenmrsData implements Serializable {

	private static final long serialVersionUID = -1619599668675538201L;

	// Fields
	@DocumentId
	private Integer drugGroupId;
	List<Drug> drugs;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.drugGroupId;
	}

	@Override
	public void setId(Integer drugGroupId) {

		this.drugGroupId = drugGroupId;
	}

	public List<Drug> getDrugs() {
		return drugs;
	}

	public void setDrugs(List<Drug> drugs) {
		this.drugs = drugs;
	}
}
