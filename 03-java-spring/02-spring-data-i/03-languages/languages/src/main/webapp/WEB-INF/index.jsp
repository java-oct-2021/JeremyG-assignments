<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Languages</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th scope="col">Name</th>
      			<th scope="col">Creator</th>
      			<th scope="col">Version</th>
      			<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allLanguages}" var="language">
				<tr>
					<td><a href="/show/${language.id}">${language.name}</a></td>
					<td>${language.creator}</td>
					<td>${language.currentVersion}</td>
					<td><a href="/edit/${language.id}">Edit</a> | <a href="/delete/${language.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/" method="post" modelAttribute="language">
		<p>
			<form:label path="name">Name:</form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="creator">Creator:</form:label>
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</p>		
		<p>
			<form:label path="version">Version:</form:label>
			<form:errors path="version"/>
			<form:input path="version"/>
		</p>
		<input type="submit" value="Submit"/>		
	</form:form>
</body>
</html>