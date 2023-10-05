<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
 <title>About Us Page</title>
  <link rel="stylesheet" href="css/About.css">
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
		          <a class="nav-link "  href="Home.jsp">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active"aria-current="page" href="#">About Us</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link " href="Services.jsp">Services</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="Contact.jsp">Contact Us</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
</header>
  <section class="about-us">
    <div class="about">
   <!--  mg src="about.jpg" class="pic">-->
      <div class="text">
        <h2>About Us</h2>
        <h5>The Jobs Consultation Center</h5>
          <p>At 'The Jobs', we are dedicated to helping you navigate the dynamic and competitive job market. Our mission is to empower job seekers with the knowledge, tools, and support they need to achieve their career goals.</p>
        <div class="data">
        <a href="Services.jsp" class="hire">Our Services</a>
        </div>
      </div>
    </div>
  </section>
  
</body>
</html>