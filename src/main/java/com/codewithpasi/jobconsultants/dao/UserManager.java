package com.codewithpasi.jobconsultants.dao;

import java.sql.SQLException;

import com.codewithpasi.jobconsultants.model.LoginBean;


public interface UserManager {

	public String loginUser(LoginBean loginBean) throws SQLException, ClassNotFoundException; 

	public boolean registerUser(LoginBean loginBean) throws SQLException, ClassNotFoundException; 

}
