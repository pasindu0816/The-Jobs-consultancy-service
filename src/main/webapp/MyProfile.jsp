<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix= "tag" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Consultants</title>
	<!-- latest compiled and minified CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"/>
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
		          <a class="nav-link"  href="Appointments.jsp">Appointments</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">My Profile</a>
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
    <h3>User Profile</h3>
    <p>User ID: ${loginBean.userID}</p>
    <p>Full Name: ${loginBean.fullName}</p>
    <p>Email: ${loginBean.email}</p>
    <p>Username: ${loginBean.username}</p>
    <p>Password: ${loginBean.password}</p>
    <!-- Add more profile details as needed -->
        
    
</body>


</body>
</html>