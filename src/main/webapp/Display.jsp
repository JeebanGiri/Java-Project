<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Students" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp file</title>
</head>
<body>


	<!-- Create a object using useBean -->
	<jsp:useBean id= "displaydaoo" class ="model.Students" /> 
	
	
	<%--
	displaydao.setName("Jeeban");
	--%>
	
	<!--  create setter method object using useBean-->
	<jsp:setProperty name = "displaydaoo" property ="name"  value="Ripesh"/>
	<jsp:setProperty name = "displaydaoo" property ="id"  value="21049917"/>
	<jsp:setProperty name = "displaydaoo" property ="password"  value="hehehe"/>
	
	
	<!-- print this -->
	<%-- <h1><%= displaydaoo.getName() %></h1>  --%>
	

	
	
	
	 <!-- print using usebean -->
	 <h1>Display JSP File</h1>
	 <h1><jsp:getProperty name="displaydaoo" property= "id"/></h1>
	 <h1><jsp:getProperty name="displaydaoo" property= "name"/></h1>
	 <h1><jsp:getProperty name="displaydaoo" property= "password"/></h1>
	   
</body>
</html>