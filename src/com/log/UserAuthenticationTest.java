package com.log;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserAuthenticationTest {

	@Test
	void loginUserSuccessTest() {
		UserAuthentication ua=new UserAuthentication();
		String actual=ua.loginUser("manish", "manish01");
		String expected="Successfully logged in";
		assertEquals(expected,actual);
	}
	
	@Test	
	void loginUserFailureTest() {
		UserAuthentication ua=new UserAuthentication();
		assertThrows(RuntimeException.class,()->ua.loginUser("","manish01"));
		}

}
