<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Category</title>
</head>
<body>
	<div>
		<h1>New Category</h1>
		
		<form:form method="post" action="/categories/new" modelAttribute="category">
		
			<p>
				<form:label path="name">Name:</form:label>
				<form:errors path="name"/>
				<form:input path="name"/>
			</p>
			
			<div>
				<input type="submit" value="submit"/>
			</div>
			
		</form:form>
		
	</div>
</body>
</html>