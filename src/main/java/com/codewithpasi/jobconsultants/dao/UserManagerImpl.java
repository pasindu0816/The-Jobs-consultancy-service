package com.codewithpasi.jobconsultants.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.codewithpasi.jobconsultants.dao.dbutils.DbDriverManager;
import com.codewithpasi.jobconsultants.dao.dbutils.DbDriverManagerFactory;
import com.codewithpasi.jobconsultants.model.Appointment;
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

	/*
	@Override
	public List<Map<String, Object>> fetchConsultantData() throws SQLException, ClassNotFoundException {
		
		List<Map<String, Object>> combinedData = new ArrayList<>();
	    try (Connection connection = getConnection()) {
	        String query = "SELECT u.userID, u.fullName, u.email, c.specializedCountry, c.availability" +
	                       "FROM users u " +
	                       "INNER JOIN consultants c ON u.userID = c.consultantID";
	        try (Statement statement = connection.createStatement();
	             ResultSet resultSet = statement.executeQuery(query)) {
	            while (resultSet.next()) {
	                Map<String, Object> row = new HashMap<>();
	                row.put("userID", resultSet.getObject("userID"));
	                row.put("fullName", resultSet.getObject("fullName"));
	                row.put("email", resultSet.getObject("email"));
	                row.put("specializedCountry", resultSet.getObject("specializedCountry"));
	                row.put("availability", resultSet.getObject("availability"));

	                combinedData.add(row);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return combinedData;
		
	}
	*/
	

	@Override
	public List<LoginBean> fetchAllConsultants() throws SQLException, ClassNotFoundException {
	
		Connection connection = getConnection();
		String query = "SELECT userID, fullName, email, specializedCountry, availability FROM users WHERE role='Consultant'";
		Statement st = connection.createStatement();
		
		List<LoginBean> consultantList = new ArrayList<LoginBean>();
		
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			LoginBean consultant = new LoginBean();
			consultant.setuserID(rs.getInt("userID"));
			consultant.setfullName(rs.getString("fullName"));
			consultant.setEmail(rs.getString("email"));
			consultant.setCountry(rs.getString("specializedCountry"));
			consultant.setAvailability(rs.getString("availability"));
			
			consultantList.add(consultant);
			
		}
		
		st.close();
		connection.close();
		
		return consultantList;
		
	}

	@Override
	public LoginBean getUserProfile(String userName) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setAppointment(Appointment appointment) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		 
		String query = "INSERT INTO appointments (fullName, email, consulName, appointmentDate, appointmentTime, comment) VALUES (?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, appointment.getFullName());
		ps.setString(2, appointment.getEmail()); 
		ps.setString(3, appointment.getConsulName()); 
		ps.setString(4, appointment.getDate()); 
		ps.setString(5, appointment.getTime()); 
		ps.setString(6, appointment.getComment()); 

		
		boolean result = false;
		if (ps.executeUpdate() > 0) 
			result = true;
		
		ps.close();
		connection.close();
		return result;
		
	}

	/*public LoginBean getUserProfile(String userName) throws SQLException, ClassNotFoundException {
		
		Connection connection = getConnection();
		String query = "SELECT userID, fullName, email, username, password FROM users WHERE username=?";
		Statement st = connection.createStatement();
		
		List<LoginBean> myDetails = new ArrayList<LoginBean>();
		
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			LoginBean loginBean = new LoginBean();
			loginBean.setuserID(rs.getInt("userID"));
			loginBean.setfullName(rs.getString("fullName"));
			loginBean.setEmail(rs.getString("email"));
			loginBean.setUserName(rs.getString("username"));
			loginBean.setPassword(rs.getString("password"));
			
			myDetails.add(loginBean);



		}
		
		st.close();
		connection.close();
		
		return myDetails;
		
	} */
	
	
			
}

