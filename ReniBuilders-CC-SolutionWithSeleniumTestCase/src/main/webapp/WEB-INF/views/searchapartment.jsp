<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ReniBuilders</title>
<style>.error{color:red}</style>
</head>
<body style="background-color: rgb(238,130,238)">
	<h1>Welcome to Reni Builders</h1>
	<form:form action="estimatecost" modelAttribute="customer"
		method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="customerName" name="customerName" />
				<span id="nameError" class="error">
					<form:errors path="customerName" cssClass="error"/></span>
				</td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><form:input path="mobileNo" name="mobileNo" />
				<span id="mobileNoError" class="error">
				<form:errors path="mobileNo" cssClass="error"/></span>
				</td>
				
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="emailId" name="emailId" />
				<span id="emailIdError" class="error">
				<form:errors path="emailId" cssClass="error"/></span>
				</td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" name="city" />
				<span id="cityError" class="error">
				<form:errors path="city" cssClass="error"/></span>
				</td>
			</tr>
			
			<tr>
				<td>Type of property</td>
				<td><form:radiobutton id="r1" path="propertyType" name="propertyType"
						value="1 BHK" />1BHK <form:radiobutton id="r2" path="propertyType"
						name="propertyType" value="2 BHK" />2BHK
						<span id="propertyTypeError" class="error">
						<form:errors path="propertyType" cssClass="error"/></span></td>
			</tr>

			<tr>
				<td><input id="submit" type="submit" value="CalulateEstimateCost"></td>

			</tr>
		</table>
	</form:form>
</body>
</html>