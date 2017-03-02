/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.module.openhmis.commons.api.entity.impl.BaseObjectDataServiceImpl;
import org.openmrs.module.openhmis.inventory.api.security.BasicObjectAuthorizationPrivileges;
import org.openmrs.module.pharmacyapi.model.DrugGroup;

/**
 * @author Guimino Neves
 *
 */
public class DrugGroupServiceImpl extends BaseObjectDataServiceImpl<DrugGroup, BasicObjectAuthorizationPrivileges>
		implements IDrugGroupService {

	@Override
	protected BasicObjectAuthorizationPrivileges getPrivileges() {

		return new BasicObjectAuthorizationPrivileges();
	}

	@Override
	protected void validate(DrugGroup object) {

	}
}
