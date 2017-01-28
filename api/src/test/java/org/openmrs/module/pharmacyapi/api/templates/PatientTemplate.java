/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.templates;

import org.openmrs.Patient;
import org.openmrs.module.pharmacyapi.api.util.BaseTemplateLoader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 * @author Stélio Moiane
 */
public class PatientTemplate implements BaseTemplateLoader {
	
	public static final String VALID = "valid";
	
	@Override
	public void load() {
		Fixture.of(Patient.class).addTemplate(VALID, new Rule() {
			
			{
				this.add("gender", this.random("M", "F"));
				this.add("birthdate", this.instant("now"));
				this.add("birthdateEstimated", this.random(true, false));
			}
		});
	}
}
