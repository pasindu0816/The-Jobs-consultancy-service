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
	<!-- Fontawesome Link for Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">

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
		        <li class="nav-item">
		          <a class="nav-link" href="About.jsp">About Us</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="Services.jsp">Services</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="Contact.jsp">Contact Us</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
		</header>
		
		<section class="homepage" id="home">
      		<div class="content">
        		<div class="text">
          			<h2>Welcome to The Jobs Consultation Centre</h2>
          			<p>We provide free consultation services to job seekers planning to work abroad.<br> If you need advice on job opportunities, please schedule an appointment with our consultants.</p>
        		</div>
        		<a onclick = "window.location.href='Login.jsp';">Join Us</a>
      		</div>
    	</section>
    	
    	<footer>
    		<div>
        		<span>Copyright © 2023 All Rights Reserved</span>
     		</div>
	    </footer>
	    	
	 </body>
			
</html>
