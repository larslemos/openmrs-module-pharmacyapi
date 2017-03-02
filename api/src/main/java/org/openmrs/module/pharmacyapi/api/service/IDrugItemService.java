/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.module.openhmis.commons.api.entity.IObjectDataService;
import org.openmrs.module.pharmacyapi.model.DrugItem;

/**
 * @author Guimino Neves
 *
 */
public interface IDrugItemService extends IObjectDataService<DrugItem> {

	String NAME = "org.openmrs.module.pharmacyapi.api.service.IDrugItemService";

}
