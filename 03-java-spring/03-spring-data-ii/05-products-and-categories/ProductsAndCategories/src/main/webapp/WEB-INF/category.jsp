<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>${category.name}</title>
</head>
<body>
	<div>
	
		<h1>${category.name}</h1>
		
		<div>
		
			<div>
				<h3>Products:</h3>
					<ul>
						<c:forEach items="${added}" var="item">
							<li>${item.name}</li>
						</c:forEach>
					</ul>
			</div>
			
			<div>
				<form method="post" action="/categories/${category.id}"> 
					<p>
						<label>Add Product:</label>
						<select name="proid">
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