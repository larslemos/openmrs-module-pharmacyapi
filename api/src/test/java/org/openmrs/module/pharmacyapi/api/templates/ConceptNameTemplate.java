/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.templates;

import java.util.Locale;

import org.openmrs.ConceptName;
import org.openmrs.module.pharmacyapi.api.util.BaseTemplateLoader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 * @author Stélio Moiane
 */
public class ConceptNameTemplate implements BaseTemplateLoader {
	
	public static final String BEFORE_MEALS = "BEFORE_MEALS";
	
	@Override
	public void load() {
		Fixture.of(ConceptName.class).addTemplate(BEFORE_MEALS, new Rule() {
			
			{
				this.add("name", "Antes das refeições");
				this.add("locale", new Locale("pt", "PT"));
			}
		});
	}
	
}
