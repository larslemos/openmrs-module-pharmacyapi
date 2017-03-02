/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.templates;

import org.openmrs.PersonName;
import org.openmrs.module.pharmacyapi.api.util.BaseTemplateLoader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 * @author Stélio Moiane
 */
public class PersonNameTemplate implements BaseTemplateLoader {
	
	public static final String VALID = "VALID";
	
	@Override
	public void load() {
		Fixture.of(PersonName.class).addTemplate(VALID, new Rule() {
			
			{
				this.add("givenName", "Stelio");
				this.add("middleName", "Klesio Adriano");
				this.add("familyName", "Moiane");
			}
		});
	}
}
