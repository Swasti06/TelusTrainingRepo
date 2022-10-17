package com.log;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class UserAuthentication {
	Log logger=LogFactory.getLog(UserAuthentication.class);
	public String loginUser(String username, String password ) {
		if(username.isBlank()) {
			logger.debug("username is blank");
			throw new RuntimeException("user invalid");
		}
		logger.info("successfully logged in");
		return "Successfully logged in";
	}
//	Log logger=LogFactory.getLog(UserAuthentication.class);
//	public void loginUser(String username, String password ) {
//		if(username.isBlank()) {
//			logger.info("username is invalid");
//			throw new RuntimeException("user invalid");
//		}
//	}

}
