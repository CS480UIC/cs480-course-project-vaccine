<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> All Vaccine Order Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>order_id</th>
		<th>vaccine_name</th>
		<th>country_id</th>
		<th>quantity</th>
		<th>order_date</th>
	</tr>
<c:forEach items="${vaccine_orderAllList}" var="vaccine_order">
	<tr>
		<td>${vaccine_order.order_id}</td>
		<td>${vaccine_order.vaccine_name}</td>
		<td>${vaccine_order.country_id}</td>
		<td>${vaccine_order.quantity}</td>
		<td>${vaccine_order.order_date}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
