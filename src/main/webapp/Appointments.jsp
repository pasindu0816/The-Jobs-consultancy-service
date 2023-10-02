<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix= "tag" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Appointments</title>
	<!-- latest compiled and minified CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
	<link rel="stylesheet" href="css/formswithNavbar.css">
	<!-- latest compiled JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</head>

<header>
		  <nav class="navbar navbar-expand-lg bg-body-tertiary">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">The Jobs</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse" id="navbarNav">
		      <ul class="navbar-nav">
		        <li class="nav-item">
		          <a class="nav-link" href="UserHome.jsp">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link"  href="fetchAllConsultants?actiontype=allConsultants">Consultants</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">Appointments</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="getUserProfile?actiontype=myProfile">My Profile</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" style="color: #FE3D3D" href="<%=request.getContextPath()%>/LogoutController">Log out</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
		<br>
</header>
<body>

	<div class ="container">
		<h3>Place your Appointments</h3>
		<p style='color:magenta'>${feedbackmessage}</p>
		<br>
		
		<form action = "setAppointment" method= "post">
		<div class="form-group">
			<label for="fullnameForAppointment">Full Name:</label>
			<input class="form-control" type= "text" name= "name" placeholder="Enter your Full Name" id= "fullnameForAppointment"/>
			<br>
		</div>
		<div class="form-group">
			<label for="emailForAppointment">Email:</label>
			<input class="form-control" type= "email" name= "email" placeholder="Enter your email address" id= "emailForAppointment"/>
			<br>
		</div>
		<div class="form-group">
			<label for="consulName">Consultant's Name:</label>
			<input class="form-control" type= "text" id= "consulName" name= "consulName"/>	
			<br>
		</div>
		<div class="form-group">
			<label for="dateForAppointment">Appointment Date:</label>
			<input class="form-control" type= "date" name= "date" id= "dateForAppointment"/>
			<br>
		</div>
		<div class="form-group">
			<label for="timeForAppointment">Appointment Time:</label>
			<input class="form-control" type= "time" name= "time" id= "timeForAppointment"/>
			<br>
		</div>
		<div class="form-group">
			<label for="cmntForAppointment">Comment:</label>
			<input class="form-control" type= "text" name= "comment" id= "cmntForAppointment"/>
			<br>
		</div>
			
			<input type="hidden" name="actiontype" value="setAppointment"/>
			<button class="btn btn-primary" type="submit">Submit</button>	
		</form>
	</div>
</body>
</html>