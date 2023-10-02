package com.codewithpasi.jobconsultants.model;

public class LoginBean {
	
	private int userID;
	private String fullName;
	private String email;
	private String userName;
	private String password;	
	private String specializedCountry;
	private String availability;


	
	
	 public int getuserID() {
			return userID;
		}

	public void setuserID(int userID) {
			this.userID = userID;
	}
	
	public String getfullName() {
		return fullName;
	}
	
	public void setfullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCountry() {
		return specializedCountry;
	}

	public void setCountry(String specializedCountry) {
		this.specializedCountry = specializedCountry;
		
	}
	
	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		
	}

}
