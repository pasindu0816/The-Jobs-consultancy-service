<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
 <title>Our Services</title>
  <link rel="stylesheet" href="css/Services.css">
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
		          <a class="nav-link " href="About.jsp">About Us</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">Services</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="Contact.jsp">Contact Us</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
</header>
<section class="services" id="services">
      <h2>Our Services</h2>
      <h6>Explore our wide range of camping gear services.</h6>
      <ul class="cards">
        <li class="card">
          <img src="services1.jpg" alt="img">
          <h4>Career Counseling</h4>
          <p>Our expert counselors provide one-on-one guidance to help you identify your strengths, interests, and career aspirations.</p>
        </li>
        <li class="card">
          <img src="services2.jpg" alt="img">
          <h4>Interview Coaching</h4>
          <p>Our interview coaches will help you hone your interview skills and provide valuable feedback.</p>
        </li>
        <li class="card">
          <img src="services3.jpg" alt="img">
          <h4>Job Search Assistance</h4>
          <p>We'll assist you in finding job opportunities that match your qualifications and career objectives.</p>
        </li>
        <li class="card">
          <img src="services4.jpg" alt="img">
          <h4>Workshops and Seminars</h4>
          <p>Attend our workshops and seminars on various career-related topics, from effective job searching to personal branding on LinkedIn.</p>
        </li>
        <li class="card">
          <img src="services5.jpg" alt="img">
          <h4>Resume Writing</h4>
          <p> Our professional resume writers will ensure your resume stands out from the crowd.</p>
        </li>
        <li class="card">
          <img src="services6.jpg" alt="img">
          <h4>Post-Placement Support</h4>
          <p> We offer post-placement support to help you thrive in your new role.</p>
        </li>
      </ul>
</section>
</body>
</html>