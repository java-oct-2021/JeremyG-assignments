<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title><c:out value="${language.name}"/></title>
</head>
<body>
	<a href="/">Dashboard</a>

	<table>
		<tr><td><c:out value="${language.name}"/></td></tr>
		<tr><td><c:out value="${language.creator}"/></td></tr>
		<tr><td><c:out value="${language.version}"/></td></tr>
	</table>
	
	<a href="/languages/edit/${id}">Edit</a>
	<a href="/languages/delete/${id}">Delete</a>
</body>
</html>