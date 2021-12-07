<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> Zip Code Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>zip_code</th>
		<th>vaccine_name</th>
		<th>state_id</th>
		<th>percentage</th>
		<th>Number of Vaccination Centres</th>
	</tr>
<c:forEach items="${zip_codeList}" var="zip_code">
	<tr>
		<td>${zip_code.zip_code}</td>
		<td>${zip_code.vaccine_name}</td>
		<td>${zip_code.state_id}</td>
		<td>${zip_code.percentage}</td>
		<td>${zip_code.num_vaccination_centre}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
