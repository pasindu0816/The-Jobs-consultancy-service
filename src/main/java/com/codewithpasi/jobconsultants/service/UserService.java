package com.codewithpasi.jobconsultants.service;

import java.sql.SQLException;

import com.codewithpasi.jobconsultants.dao.UserManager;
import com.codewithpasi.jobconsultants.dao.UserManagerImpl;
import com.codewithpasi.jobconsultants.model.LoginBean;

public class UserService {
	
	private static UserService userServiceObj;
	
	private UserService() { 
			
	}
	
	public synchronized static UserService getUserService() {
		if(userServiceObj == null) {
			userServiceObj = new UserService();
		}
		
		return userServiceObj;
	}
	
	private UserManager getUserManager() {
		return new UserManagerImpl();
	}
	
	public String loginUser(LoginBean loginBean) throws ClassNotFoundException, SQLException {
		return getUserManager().loginUser(loginBean);
	}
	
	public boolean registerUser(LoginBean loginBean) throws ClassNotFoundException, SQLException {
		return getUserManager().registerUser(loginBean);
	}


}
