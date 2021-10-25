<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<a href="/languages/delete/${id}">Delete</a>
	<a href="/">Dashboard</a>
	<form:form action="/languages/edit/${id}" method="POST" modelAttribute="language">
	
	<form:hidden path="id"/>
	
	<form:label path="name">Name
	<form:errors path="name"/>
	<form:input path="name"/>
	</form:label> 
	
	<form:label path="creator">Creator
	<form:errors path="creator"/>
	<form:input path="creator"/>
	</form:label>
	
	
	<form:label path="version">Version
	<form:errors path="version"/>
	<form:input path="version"/>
	</form:label>
	
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>