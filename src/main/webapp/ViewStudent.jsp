<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "model.StudentDatabaseDao"%>
<%@ page import = "java.sql.ResultSet"%>
<%-- <%@ include file="StudentRegistration.html" %>  --%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display File</title>
<link rel="stylesheet" type="text/css" href="jsp.css" >
</head>
<body>
	<h2 class="header">
		This is JSP Display File
	</h2>
	
	<%-- <%
		StudentDatabaseDao dao = new StudentDatabaseDao();
		ResultSet table = dao.fetchConnection();
		
		if (table != null){
	%> --%>
		<table border=1 class="table">	
			<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Password</th>
			<th>Gender</th>
			<th>Comment</th>
			<th>Images</th>
			</tr>
			<c:forEach var="stdata" items="${ studentList }">
				<tr>
					<td><c:out value="${st.id}"/></td>
					<td>${stdata.name}</td>
					<td>${stdata.gender}</td>
					<td>${stdata.addres }</td>
					<td>${stdata.password }</td>
					<td>${stdata.comment }</td>
					<td><img src="images/${stdata.image }" height="100px" width="100px"></td>
					<td><a href="${pageContext.request.contextPath }editStudent?id=${stdata.id }" > Edit </a> <a href="">Delete</a></td>
				</tr>
				
				
			</c:forEach>
<%-- 			<%
			while(table.next())  
				{  
				int id =(table.getInt(1));
				String name = ( table.getString(2));
				String address = (table.getString(3));
				String gender = ( table.getString(4));
				String password = ( table.getString(5));
				String comment = (table.getString(6));
			%>
				<tr>
				<td><%=id %></td>
				<td><%=name %></td>
				<td><%=address %></td>
				<td><%=gender %></td>
				<td><%=password %></td>
				<td><%=comment %></td>
				
			<% 					                  
				}
			%> --%>
		</table>
	
<%-- 	<% 
		}
		
		
	%> --%>

</body>
</html>