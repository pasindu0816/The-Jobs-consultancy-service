<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix= "tag" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="css/NewFile.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body>
<div class = "bg-img">
    <div class="content">
        <header>Login</header>
        <form action="loginUser" method="POST">
            <div class="field">
            	<span class="fa fa-user"></span>
                <input type="text" id="username" name="username" placeholder="Username" required>
            </div>
            <div class="field space">
            	<span class="fa fa-lock"></span>
                <input type="password" class="pass-key" placeholder="Password"id="password" name="password" required>  
                <input type="hidden" name="actiontype" value="login"/>  
            </div>
            <br>
            <div class="field">
                  <input type="submit" value="LOGIN">
            </div>
         </form>
         <br>
         <div class="signup">
               Don't have an account?
               <a href="Register.jsp">Signup Now</a>
         </div>
                  
    </div>
</div>    
</body>
</html>
