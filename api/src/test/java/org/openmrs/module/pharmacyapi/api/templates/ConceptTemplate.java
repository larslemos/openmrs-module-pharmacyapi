/*
 * Friends in Global Health - FGH © 2016
 */
package org.openmrs.module.pharmacyapi.api.templates;

import org.openmrs.Concept;
import org.openmrs.module.pharmacyapi.api.util.BaseTemplateLoader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 * @author Stélio Moiane
 */
public class ConceptTemplate implements BaseTemplateLoader {
	
	public static final String TREATMENT_PRESCRIBED_SET = "TREATMENT_PRESCRIBED_SET";
	
	public static final String TREATMENT_PRESCRIBED = "TREATMENT_PRESCRIBED";
	
	public static final String ARV_DOSAGE_AMOUNT = "ARV_DASAGE_AMOUNT";
	
	public static final String PREVIOUS_ANTIRETROVIRAL_DRUGS = "PREVIOUS_ANTIRETROVIRAL_DRUGS";
	
	public static final String ARV_PLAN = "ARV_PLAN";
	
	public static final String REASON_ANTIRETROVIRALS_STOPPED = "REASON_ANTIRETROVIRALS_STOPPED";
	
	public static final String JUSTIFICATION_TO_CHANGE_ARV_TREATMENT = "JUSTIFICATION_TO_CHANGE_ARV_TREATMENT";
	
	public static final String DOSING_UNITS = "DOSING_UNITS";
	
	public static final String DOSAGE_FREQUENCY = "DOSAGE_FREQUENCY";
	
	public static final String DRUG_ROUTES = "DRUG_ROUTES";
	
	public static final String DURATION = "DURATION";
	
	public static final String DURATION_UNITS = "DURATION_UNITS";
	
	public static final String DOSING_INSTRUCTIONS = "DOSING_INSTRUCTIONS";
	
	public static final String POC_MAPPING_PRESCRIPTION_DATE = "POC_MAPPING_PRESCRIPTION_DATE";
	
	@Override
	public void load() {
		
		Fixture.of(Concept.class).addTemplate(TREATMENT_PRESCRIBED_SET, new Rule() {
			
			{
				this.add("conceptId", 6484);
				this.add("uuid", "ac465c58-68ef-4a19-88ae-c7f72e89a2b2");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(TREATMENT_PRESCRIBED, new Rule() {
			
			{
				this.add("conceptId", 1719);
				this.add("uuid", "e1de3092-1d5f-11e0-b929-000c29ad1d07");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(ARV_DOSAGE_AMOUNT, new Rule() {
			
			{
				this.add("conceptId", 1793);
				this.add("uuid", "e1de8966-1d5f-11e0-b929-000c29ad1d07");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(PREVIOUS_ANTIRETROVIRAL_DRUGS, new Rule() {
			
			{
				this.add("conceptId", 1087);
				this.add("uuid", "e1d83d4a-1d5f-11e0-b929-000c29ad1d07");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(ARV_PLAN, new Rule() {
			
			{
				this.add("conceptId", 1255);
				this.add("uuid", "e1d9ee10-1d5f-11e0-b929-000c29ad1d07");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(REASON_ANTIRETROVIRALS_STOPPED, new Rule() {
			
			{
				this.add("conceptId", 1252);
				this.add("uuid", "e1d9ead2-1d5f-11e0-b929-000c29ad1d07");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(JUSTIFICATION_TO_CHANGE_ARV_TREATMENT, new Rule() {
			
			{
				this.add("conceptId", 1792);
				this.add("uuid", "e1de8862-1d5f-11e0-b929-000c29ad1d07");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(DOSING_UNITS, new Rule() {
			
			{
				this.add("conceptId", 6390);
				this.add("uuid", "9d66a447-10e8-11e5-9009-0242ac110012");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(DOSAGE_FREQUENCY, new Rule() {
			
			{
				this.add("conceptId", 6338);
				this.add("uuid", "5368f4d6-10e7-11e5-9009-0242ac110012");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(DRUG_ROUTES, new Rule() {
			
			{
				this.add("conceptId", 6398);
				this.add("uuid", "9d6a9238-10e8-11e5-9009-0242ac110012");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(DURATION, new Rule() {
			
			{
				this.add("conceptId", 1710);
				this.add("uuid", "e1de27a0-1d5f-11e0-b929-000c29ad1d07");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(DURATION_UNITS, new Rule() {
			
			{
				this.add("conceptId", 6408);
				this.add("uuid", "9d6f0bea-10e8-11e5-9009-0242ac110012");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(DOSING_INSTRUCTIONS, new Rule() {
			
			{
				this.add("conceptId", 6414);
				this.add("uuid", "9d73c2a7-10e8-11e5-9009-0242ac110012");
			}
		});
		
		Fixture.of(Concept.class).addTemplate(POC_MAPPING_PRESCRIPTION_DATE, new Rule() {
			
			{
				this.add("conceptId", 6485);
				this.add("uuid", "488e6803-c7db-43b2-8911-8d5d2a8472fd");
			}
		});
	}
}
