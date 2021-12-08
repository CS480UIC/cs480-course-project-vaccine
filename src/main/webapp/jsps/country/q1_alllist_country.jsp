<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> All country Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>country_id</th>
		<th>vaccine_name</th>
		<th>country_name</th>
		<th>population</th>
		<th>cost</th>
		<th>percentage_vaccinated</th>
	</tr>
<c:forEach items="${countryAllList}" var="country">
	<tr>
		<td>${country.country_id}</td>
		<td>${country.vaccine_name}</td>
		<td>${country.country_name}</td>
		<td>${country.population}</td>
		<td>${country.cost}</td>
		<td>${country.percentage_vaccinated}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
