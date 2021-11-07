<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>${product.name} page</title>
</head>
<body>
	<div class="container">
		<h1>${product.name}</h1>
		
		<div>
			<div>
				<h3>Categories:</h3>
				<ul>
					<c:forEach items="${added}" var="item">
						<li>${item.name}</li>
					</c:forEach>
				</ul>
			</div>
			
			<div>
				<form method="post" action="/products/${product.id}"> 
					<p>
						<label>Add Category:</label>
						<select name="catid">
							<c:forEach items="${menu}" var="item">
								<option value="${item.id}">${item.name}</option>
							</c:forEach>
						</select>
					</p>
					
					<div>
						<input type="submit" value="add"/>
					</div>
					
				</form>
			</div>
			
		</div>
	</div>
</body>
</html>