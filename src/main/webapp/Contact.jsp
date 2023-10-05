<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
 <title>Contact Us</title>
  <link rel="stylesheet" href="css/contact.css">
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
		          <a class="nav-link " href="Services.jsp">Services</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">Contact Us</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
</header>
	<section class="contact" id="contact">
	<div class = "text">
      <h2>Contact Us</h2>
      <p>Reach out to us for any inquiries or feedback.</p>
    </div>
      <div class="row">
        <div class="col information">
          <div class="contact-details">
            <p><i class="fas fa-map-marker-alt"></i> 123, Colombo, Sri Lanka</p>
            <p><i class="fas fa-envelope"></i> info@thejobs.com</p>
            <p><i class="fas fa-phone"></i> (123) 456-7890</p>
            <p><i class="fas fa-clock"></i> Monday - Friday: 9:00 AM - 5:00 PM</p>
            <p><i class="fas fa-clock"></i> Saturday: 10:00 AM - 3:00 PM</p>
            <p><i class="fas fa-clock"></i> Sunday: Closed</p>
            <p><i class="fas fa-globe"></i> www.thejobs.com</p>
          </div>          
        </div>
        <div class="col form">
          <form>
            <input type="text" placeholder="Name*" required>
            <input type="email" placeholder="Email*" required>
            <textarea placeholder="Message*" required></textarea>
            <button id="submit" type="submit">Send Message</button>
          </form>
        </div>
      </div>
    </section>
</body>
</html>