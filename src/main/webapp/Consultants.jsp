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
		          <a class="nav-link" href="UserHome.jsp">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">Consultants</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="Appointments.jsp">Appointments</a>
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
	<!--  
	<form>
		<label>View all Consultants</label>
		<input type="hidden" name="actiontype" value="allConsultants"/>
		<button type="submit" class="btn btn-info">View</button>
	</form>
	-->
	<p style='color:magenta'> ${message} </p>
	<br>
	<table class="table">
		<thead>
			<tr class="table-info">
				<th>Consultant ID</th>
				<th>Consultants Name</th>
				<th>Email</th>
		
					
			</tr>		
		</thead>
		<tbody>
			<tag:forEach var="consultant"  items="${consultantList}">
			<tr class="table-light">
				<td>${consultant.userID}</td>
				<td>${consultant.fullName}</td>
				<td>${consultant.email}</td>
	
				
						
			</tr>
			</tag:forEach>
			
							
		</tbody>
	</table> 
	
	</body>
</html>