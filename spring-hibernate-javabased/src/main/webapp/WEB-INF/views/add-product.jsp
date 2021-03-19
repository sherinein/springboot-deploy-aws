<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b> Add Product</b>
	<form:form action="addnewproduct" method="post" modelAttribute="product">
	<!-- need to associate this data with product id -->
		<table>
			
			<tr>
				<td>Enter the Product Name</td>
				<td><form:input id="productName" path="productName"  name="productName" /></td>
			</tr>
			<tr>
				<td>Enter the Quantity</td>
				<td><form:input id="quantity" path="quantity" name="quantity" /></td>
			</tr>
			<tr>
				<td>Enter the Price</td>
				<td><form:input id="price" path="price" name="price" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Product"/></td>
				<td><input type="reset" value="Cancel Product"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>