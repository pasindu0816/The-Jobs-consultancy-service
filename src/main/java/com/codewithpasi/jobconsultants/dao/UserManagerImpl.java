package com.codewithpasi.jobconsultants.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.codewithpasi.jobconsultants.dao.dbutils.DbDriverManager;
import com.codewithpasi.jobconsultants.dao.dbutils.DbDriverManagerFactory;
import com.codewithpasi.jobconsultants.model.LoginBean;

public class UserManagerImpl implements UserManager{
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		
		DbDriverManagerFactory driverFactory = new DbDriverManagerFactory();
		DbDriverManager driverManager = driverFactory.getDbdriver("MySql");
		
		return driverManager.getConnection();
	}

	@Override
	public String loginUser(LoginBean loginBean) throws SQLException, ClassNotFoundException {

	
		String userName = loginBean.getUserName();
		String password = loginBean.getPassword();
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		String userNameDB = "";
		String passwordDB = "";
		String roleDB = "";
		
		try {
			Connection connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT username, password, role FROM users");
			
			while(resultSet.next()) {
				userNameDB = resultSet.getString("username");
				passwordDB = resultSet.getString("password");
				roleDB = resultSet.getString("role");
				
				if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Admin")) {
					return "Admin_Role";
				}
				else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("Consultant")) {
					return "Consultant_Role";
				}
				else if(userName.equals(userNameDB) && password.equals(passwordDB) && roleDB.equals("User")) {
					return "User_Role";
				}			
			}	
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return "Invalid user credentials";
		
	}

	@Override
	public boolean registerUser(LoginBean loginBean) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
	
		
		String query = "INSERT INTO users (fullName, email, username, password) VALUES (?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, loginBean.getfullName());
		ps.setString(2, loginBean.getEmail());
		ps.setString(3, loginBean.getUserName());
		ps.setString(4, loginBean.getPassword());  

		
		boolean result = false;
		if (ps.executeUpdate() > 0) 
			result = true;
		
		ps.close();
		connection.close();
		return result;
		
	}
			
}

