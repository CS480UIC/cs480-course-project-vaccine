<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Complex 1 </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>vaccine_name</th>
		<th>temperature</th>
		<th>vaccine_quantity</th>
		<th>cost</th>
	</tr>
<c:forEach items="${Complex1List}" var="vaccine2">
	<tr>
		<td>${vaccine2.vaccine_name}</td>
		<td>${vaccine2.temperature}</td>
		<td>${vaccine2.vaccine_quantity}</td>
		<td>${vaccine2.cost}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
