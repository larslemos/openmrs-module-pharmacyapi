/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.module.openhmis.commons.api.entity.IObjectDataService;
import org.openmrs.module.pharmacyapi.model.DrugGroup;

/**
 * @author Guimino Neves
 *
 */
public interface IDrugGroupService extends IObjectDataService<DrugGroup> {

	String NAME = "org.openmrs.module.pharmacyapi.api.service.IDrugGroupService";
}
