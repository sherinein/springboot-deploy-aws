<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.hibernate.shopping.entity.Product,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>Product Id</td>
				<td>Product Name</td>
				<td>Quantity</td>
				<td>Price</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty productlist}">
				<c:forEach var="product" items="${productlist}">
				<tr>
					<td>${product.pid}</td>
					<td>${product.productName}</td>
					<td>${product.quantity}</td>
					<td>${product.price}</td>
					<td><a href="update?productId=${product.pid}">Update</a> | <a href="delete?productId=${product.pid}">Delete</a></td>
					
				</tr>	
				
				</c:forEach>
			</c:if>
		</tbody>
	</table>
</body>
</html>
