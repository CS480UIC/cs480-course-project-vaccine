<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Entity</title>
    
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
  <h1>Update Entity</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	Vaccine Name    :<input type="text" name="vaccine_name" value="${vaccine1.vaccine_name }" disabled/>
	<br/>
	
	
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/vaccineServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="username" value="${entity1.username }"/>
	Temperature：<input type="text" name="Temperature" value="${form.temperature }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	Vaccine Quantity	：<input type="text" name="vaccine_quantity" value="${form.vaccine_quantity }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_quantity }</span>
	<br/>
	Cost	：<input type="text" name="cost" value="${form.cost }"/>
	<span style="color: red; font-weight: 900">${errors.cost }</span>
	<br/>
	<input type="submit" value="Update Entity1"/>
</form>

</body>
</html>
