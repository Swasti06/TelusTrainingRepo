package com.logging.practice;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class MainClass {

	public static void main(String[] args) throws InvalidAge, MedicalVerification, PoliceVerification {
		Log logger=LogFactory.getLog(MainClass.class);


		Applicant a1=new Applicant("Swasti", 19, "unfit", "clear");
		Applicant a2=new Applicant("Manya", 14, "fit", "clear");
		Applicant a3=new Applicant("Aakriti", 23, "fit", "not clear");
		Applicant a4=new Applicant("Aarushi", 19, "fit", "clear");
		Applicant a5=new Applicant("Pragya", 19, "fit", "clear");
		try {
		a1.dlEligibility();}
		catch (Exception e){
			logger.error("Error occurred while applying DL for "+a1.getName());			
		}
		try {
		a2.dlEligibility();}
		catch (Exception e) {
			logger.error("Error occurred while applying DL for "+a2.getName());
		}
		try {
			a3.dlEligibility();}
			catch (Exception e) {
				logger.error("Error occurred while applying DL for "+a3.getName());
			}
		try {
			a4.dlEligibility();}
			catch (Exception e) {
				logger.error("Error occurred while applying DL for "+a4.getName());
			}
		try {
			a5.dlEligibility();}
			catch (Exception e) {
				logger.error("Error occurred while applying DL for "+a5.getName());
			}
		
	}

}
