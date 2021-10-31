<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Zip Code</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Delete Entity</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/zipcodeServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="username" value="${zipcode.username }"/>
	Zip Code    :<input type="text" name="zipcode" value="${zipcode.zip_code }" disabled/>
	<br/>
	
	Vaccine Name：<input type="text" name="vaccine_name" value="${zipcode.vaccine_name }" disabled/>
	<br/>
	State ID	：<input type="text" name="state_id" value="${zipcode.state_id }" disabled/>
	<br/>
	Percentage	：<input type="text" name="percentage" value="${zipcode.percentage }" disabled/>
	<br/>
	Number Of Vaccination Centres	：<input type="text" name="num_vaccine_centre" value="${zipcode.num_vaccine_centre }" disabled/>
	<br/>
	<input type="submit" value="Delete zipcode"/>
</form>

</body>
</html>
