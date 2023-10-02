package com.codewithpasi.jobconsultants.model;

public class Appointment {
	
	private int appointmentID;
	private String fullName;
	private String email;
	private String consulName;
	private String date;
	private String time;
	private String comment;

	
	public Appointment() {
		
	}
	
	public Appointment(int appointmentID, String fullName, String email, String consulName, String appointmentDate, String appointmentTime, String comment) {
		
		this.appointmentID = appointmentID;
		this.fullName = fullName;
		this.email = email;
		this.consulName = consulName;
		this.date = appointmentDate;
		this.time = appointmentTime;
		this.comment = comment;
		
	}
	
	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setAppointmentID(String email) {
		this.email = email;
	}
	
	public String getConsulName() {
		return consulName;
	}

	public void setConsulName(String consulName) {
		this.consulName = consulName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String appointmentDate) {
		this.date = appointmentDate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String appointmentTime) {
		this.time = appointmentTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


}
