/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.model;
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

	List<Drug> members;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.drugGroupId;
	}

	@Override
	public void setId(Integer drugGroupId) {

		this.drugGroupId = drugGroupId;
	}

	public List<Drug> getMembers() {
		return members;
	}

	public void setMembers(List<Drug> members) {
		this.members = members;
	}

}
