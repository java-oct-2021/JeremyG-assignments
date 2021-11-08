<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<a href="/questions">Go back</a>
		<h1>What is your question?</h1>
		<form action="/questions/new" method="post">
			<p class="form-group">
				<label for="question">Question: </label>
				<textarea name="question" class="form-control"></textarea>
				<form:errors path="question"/>
			</p>
			<p class="form-group">
				<label for="tags">Tags: </label>
				<input name="tags" class="form-control"/>
				<form:errors path="tags"/>
			</p>
			<input type="submit" class="form-control btn btn-outline-secondary" value="Submit"/> 
		</form>
	</div>
</body>
</html>