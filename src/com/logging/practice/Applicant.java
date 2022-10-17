package com.logging.practice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class Applicant {
	
	//comment here
	
	Log logger=LogFactory.getLog(Applicant.class);
	
	public String dlEligibility() throws InvalidAge, PoliceVerification, MedicalVerification {
		boolean eligible=checkApplicantforDL();
		if (eligible==true) {
			return "can apply";
		}
		else {
			return "cannot apply";
		}
		
	}
	

	private String name;
	private int age;
	private String medical;
	private String policeVerifiation;
	
	
	
	public Applicant(String name, int age, String medical, String policeVerifiation) {
		super();
		this.name = name;
		this.age = age;
		this.medical = medical;
		this.policeVerifiation = policeVerifiation;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMedical() {
		return medical;
	}
	public void setMedical(String medical) {
		this.medical = medical;
	}
	public String getPoliceVerifiation() {
		return policeVerifiation;
	}
	public void setPoliceVerifiation(String policeVerifiation) {
		this.policeVerifiation = policeVerifiation;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Applicant [name=" + name + ", age=" + age + ", medical=" + medical + ", policeVerifiation="
				+ policeVerifiation + "]";
	}


	public boolean checkApplicantforDL() throws InvalidAge, PoliceVerification, MedicalVerification{
		if(this.age<18) {
			logger.info("Age is not valid");
			throw new InvalidAge("Age not valid for applying");
		}
		else if((this.medical).equals("unfit")){
			logger.info("Medically not fit");

			throw new MedicalVerification("Applicant medically unfit to apply");
		}
		else if((this.policeVerifiation).equals("not clear")) {
			logger.info("Police verification not clear");

			throw new PoliceVerification("Applicant's criminal record not clear");
		}
		return true;
	}
	
	

}
