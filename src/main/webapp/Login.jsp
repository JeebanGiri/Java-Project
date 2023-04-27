<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="Login.css" >
</head>
<body>		
	<h1 class="heading">Login Form</h1>
  	<form action="loginstudent">
    <h2>Login to your account</h2>
    <input type="text" title="studentid" placeholder="Enter Id or Username" name="id" />
    <input type="password" title="studentpassword" placeholder="Password" name="password" />
    <button type="submit" class="btn" name="login">Login</button>
    <a class="forgot" href="#">Forgot Password?</a>
   </form>
</body>
</html>