<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="/css/style.css"/>
	<script src="js/script.js"></</script>
	<title>Date Display</title>
</head>
<body>
	
<body>
	<script>dateAlert()</script>
	<div class="date"> 
		<fmt:formatDate pattern="EEEE, 'the' dd'th' 'of' MMMM, Y" value="${date}"/>
	</div>
</body>
</html>