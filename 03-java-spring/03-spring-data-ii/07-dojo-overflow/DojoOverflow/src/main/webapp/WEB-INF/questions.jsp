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
		<h1>Question dashboard</h1>
		<a href="/questions/new">New Question</a>
		<table class="table-hover table table-bordered">
				<tr>
					<th>Question</th>
					<th>Tags</th>
				</tr>
				<c:forEach var="question" items="${questions}">
					<tr>
						<td><a href="/questions/${question.id}"><c:out value="${question.question}" /></a></td>
						<td>
						<c:forEach var="tag" items="${question.tags}" varStatus="loop" >
							<c:out value="${tag.name}"/>${loop.last ? '' : ','}
						</c:forEach>
						</td>
					</tr>
				</c:forEach>
			</table>
	</div>
</body>
</html>