package com.codewithpasi.jobconsultants.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.codewithpasi.jobconsultants.model.Appointment;
import com.codewithpasi.jobconsultants.model.LoginBean;


public interface UserManager {

	public String loginUser(LoginBean loginBean) throws SQLException, ClassNotFoundException; 

	public boolean registerUser(LoginBean loginBean) throws SQLException, ClassNotFoundException; 
		
	//List<Map<String, Object>> fetchConsultantData() throws SQLException, ClassNotFoundException;

	public List<LoginBean> fetchAllConsultants() throws SQLException, ClassNotFoundException;

	public LoginBean getUserProfile(String userName) throws SQLException, ClassNotFoundException;
	
	public boolean setAppointment(Appointment appointment) throws SQLException, ClassNotFoundException;


}
