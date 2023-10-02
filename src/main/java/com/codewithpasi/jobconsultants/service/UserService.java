package com.codewithpasi.jobconsultants.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.codewithpasi.jobconsultants.dao.UserManager;
import com.codewithpasi.jobconsultants.dao.UserManagerImpl;
import com.codewithpasi.jobconsultants.model.Appointment;
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
	
	public List<LoginBean> fetchAllConsultants() throws ClassNotFoundException, SQLException{
		return getUserManager().fetchAllConsultants();
	}
	
	public LoginBean getUserProfile (String userName) throws ClassNotFoundException, SQLException {
		return getUserManager().getUserProfile(userName);
	}
	
	public boolean setAppointment(Appointment appointment) throws ClassNotFoundException, SQLException {
		return getUserManager().setAppointment(appointment);
	}
	
	/*public List<Map<String, Object>> fetchConsultantData() throws ClassNotFoundException, SQLException{
		return getUserManager().fetchConsultantData();
	}*/



}
