/**
 * 
 * UCSF -Global Programms 2017
 * 
 */
package org.openmrs.module.pharmacyapi.api.service;

import org.openmrs.api.impl.BaseOpenmrsService;

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
