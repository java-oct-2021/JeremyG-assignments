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
		<form action="/result">
			<p> Your Name: <input type="text" name="name"> </p>
			<p>Dojo Location: 
				<select name="location">
					<option value="Seattle">Seattle</option>
					<option value="Chicago">Chicago</option>
					<option value="San Jose">San Jose</option>
					<option value="Dallas">Dallas</option>
				</select>
			</p>
			<p>Favorite Program: 
				<select name="language">
					<option value="Java">Java</option>
					<option value="Python">Python</option>
					<option value="C#">C#</option>
					<option value="JavaScript">JavaScript</option>
				</select>
			</p>
			<p>Comment:<br>
				<textarea name="comment" rows=4 cols=50>Enter text here...</textarea>
			</p>
			<button>Submit</button>
		</form>
	</div>
</body>
</html>