<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<a href="/questions">Go back</a>
		<h1>
			<c:out value="${question.question}" />
		</h1>
		<h4>
			Tags:
			<c:forEach var="tag" items="${question.tags}" varStatus="loop">
				<c:out value="${tag.name}"/>${loop.last ? ' ' : ','}
			</c:forEach>
		</h4>
		<div class="left">
			<table class="table-hover table table-bordered">
				<tr>
					<th>Answers</th>
				</tr>
				<c:forEach var="answer" items="${question.answers}">
					<tr>
						<td><c:out value="${answer.answer}" /></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="right">
			<h3>Answer this question: </h3>
			<form action="/questions/${question.id}" method="post">
				<p class="form-group">
					<textarea name="answer" class="form-control"></textarea>
					<form:errors path="answer"/>
				</p>
				<input type="submit" value="Answer" class="btn btn-outline-secondary form-control"/>
			</form>
		</div>
	</div>
</body>
</html>