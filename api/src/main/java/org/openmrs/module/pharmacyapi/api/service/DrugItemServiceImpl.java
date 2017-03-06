/**
 * 
 * UCSF -Global Programms 2017
 * 
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.module.openhmis.commons.api.entity.impl.BaseObjectDataServiceImpl;
import org.openmrs.module.openhmis.inventory.api.security.BasicObjectAuthorizationPrivileges;
import org.openmrs.module.pharmacyapi.model.DrugItem;

/**
 * @author Guimino Neves
 *
 */
public class DrugItemServiceImpl extends BaseObjectDataServiceImpl<DrugItem, BasicObjectAuthorizationPrivileges>
		implements IDrugItemService {

	@Override
	protected BasicObjectAuthorizationPrivileges getPrivileges() {

		return new BasicObjectAuthorizationPrivileges();
	}

	@Override
	protected void validate(DrugItem object) {

	}

}
