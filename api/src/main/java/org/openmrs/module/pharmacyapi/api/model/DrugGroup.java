/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.model;

import java.util.List;

import org.openmrs.BaseOpenmrsMetadata;
import org.openmrs.Drug;

/**
 * @author Guimino Neves
 */
public class DrugGroup extends BaseOpenmrsMetadata {
	
	private Integer drugGroupId;
	
	List<Drug> members;
	
	@Override
	public Integer getId() {
		return this.drugGroupId;
	}
	
	@Override
	public void setId(final Integer drugGroupId) {
		
		this.drugGroupId = drugGroupId;
	}
	
	public List<Drug> getMembers() {
		return this.members;
	}
	
	public void setMembers(final List<Drug> members) {
		this.members = members;
	}
}
