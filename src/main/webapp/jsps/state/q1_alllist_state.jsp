<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> All state Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>state_id</th>
		<th>vaccine_name</th>
		<th>country_id</th>
		<th>state_name</th>
		<th>population</th>
		<th>percentage_vaccinated</th>
	</tr>
<c:forEach items="${stateAllList}" var="state">
	<tr>
		<td>${state.state_id}</td>
		<td>${state.vaccine_name}</td>
		<td>${state.country_id}</td>
		<td>${state.state_name}</td>
		<td>${state.population}</td>
		<td>${state.percentage}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
