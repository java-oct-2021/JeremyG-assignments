<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/css/style.css"/>
	<title>Dojo Survey</title>
</head>
<body>
	<div class=main>
		<h2>Submitted Info</h2>
		<p>Name: <c:out value="${name}"/></p>
		<p>Location: <c:out value="${location}"/></p>
		<p>Favorite Language: <c:out value="${language}"/></p>
		<p>Comment: <c:out value="${comment}"/></p>
	</div>
</body>
</html>