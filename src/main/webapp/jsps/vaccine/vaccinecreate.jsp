<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Vaccine Create</title>
    
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
  <h1>Vaccine Create</h1>
<form action="<c:url value='/vaccine1ServletCreate'/>" method="post">
	Vaccine Name    :<input type="text" name="vaccine_name" value="${form.vaccine_name }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_name }</span>
	<br/>
	Temperature：<input type="text" name="temperature" value="${form.temperature }"/>
	<span style="color: red; font-weight: 900">${errors.temperature }</span>
	<br/>
	Vaccine Quantity	：<input type="text" name="vaccine_quantity" value="${form.vaccine_quantity }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_quantity }</span>
	Cost	：<input type="text" name="cost" value="${form.cost }"/>
	<span style="color: red; font-weight: 900">${errors.cost }</span>
	<br/>
	<input type="submit" value="Create Vaccine"/>
</form>
  </body>
</html>
