<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Entity1 Create</title>
    
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
  <h1>Entity1 Create</h1>
<form action="<c:url value='/orderServletCreate'/>" method="post">
	order_id    :<input type="text" name="order_id" value="${form.username }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	vaccine_name：<input type="text" name="vaccine_name" value="${form.vaccine_name }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_name }</span>
	<br/>
	country_id	：<input type="text" name="country_id" value="${form.country_id }"/>
	<span style="color: red; font-weight: 900">${errors.country_id }</span>
	<br/>
	quantity	：<input type="text" name="quantity" value="${form.quantity }"/>
	<span style="color: red; font-weight: 900">${errors.quantity }</span>
	<br/>
	date	：<input type="text" name="date" value="${form.date }"/>
	<span style="color: red; font-weight: 900">${errors.date }</span>
	<br/>
	<input type="submit" value="Create order"/>
</form>
  </body>
</html>
