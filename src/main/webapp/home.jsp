<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to The Jobs Consultation Centre</title>
    <link rel="stylesheet" href="css/home.css">
    <!-- latest compiled and minified CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
	<!-- latest compiled JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>

</head>

    <body>
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
		          <a class="nav-link active" aria-current="page" href="#">Home</a>
		        </li>
		        <!--<li class="nav-item">
		          <a class="nav-link" href="dashboard.jsp">Dashboard</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="appointments.jsp">Appointments</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="myprofile.jsp">My Profile</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="logout.jsp">Log out</a>
		        </li> -->
		        <li class="nav-item">
		          <a class="nav-link" href="about.jsp">About</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="contact.jsp">Contact Us</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
		<br>
		</header>
		<div class="home-body">
			<main>
	        <h3>Welcome to The Jobs Consultation Centre</h3>
	        <p>We provide free consultation services to job seekers planning to work abroad.</p>
	        <p>If you need advice on job opportunities, please schedule an appointment with our consultants.</p>
	    	</main>
	    	<br>
	    	<img src="consulting.jpg" width="400" height="300">
	    	<br><br>
	    	<form>
	   			 <button type="button" class="btn btn-success" onclick = "window.location.href='Login.jsp';"
	   			 >Join Us</button>
			</form>
	    	
	    </div>
	  		</body><br><br>
			<footer>
	        	<p>&copy; 2023 The Jobs Consultation Centre</p>
	   		</footer>
	   	
</html>
