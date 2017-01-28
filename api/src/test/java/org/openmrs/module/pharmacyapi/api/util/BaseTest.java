/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.util;

import org.junit.BeforeClass;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

/**
 * @author Stélio Moiane
 */
public abstract class BaseTest {
	
	@BeforeClass
	public static void setupClass() {
		FixtureFactoryLoader.loadTemplates("org.openmrs.module.pharmacyapi.api.templates");
	}
}
