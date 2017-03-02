/**
 * 
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.module.openhmis.commons.api.entity.impl.BaseObjectDataServiceImpl;
import org.openmrs.module.openhmis.inventory.api.security.BasicObjectAuthorizationPrivileges;
import org.openmrs.module.pharmacyapi.model.DrugRegime;

/**
 * @author Guimino Neves
 *
 */
public class DrugRegimeServiceImpl extends BaseObjectDataServiceImpl<DrugRegime, BasicObjectAuthorizationPrivileges>
		implements IDrugRegimeService {

	@Override
	protected BasicObjectAuthorizationPrivileges getPrivileges() {

		return new BasicObjectAuthorizationPrivileges();
	}

	@Override
	protected void validate(DrugRegime object) {
		// TODO Auto-generated method stub

	}

}
