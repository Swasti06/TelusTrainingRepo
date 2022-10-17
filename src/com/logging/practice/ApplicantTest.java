package com.logging.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApplicantTest {

	@Test
	void dlEligibilityMedicallyUnfitTest() {
		Applicant a=new Applicant("Swasti", 19, "unfit", "clear");
		assertThrows(MedicalVerification.class,()->a.dlEligibility());
	}
	@Test
	void dlEligibilityPoliceVerificationTest() {
		Applicant a=new Applicant("Swasti", 19, "fit", "not clear");
		assertThrows(PoliceVerification.class,()->a.dlEligibility());
	}
	@Test
	void dlAgeTest() {
		Applicant a=new Applicant("Swasti", 14, "fit", "clear");
		assertThrows(InvalidAge.class,()->a.dlEligibility());
	}
	@Test
	void dlEligibleTest() throws InvalidAge, PoliceVerification, MedicalVerification {
		Applicant a=new Applicant("Swasti",18,"fit","clear");
		boolean actual=a.checkApplicantforDL();
		assertTrue(actual);
	}

}
