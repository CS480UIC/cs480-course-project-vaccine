<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>State Create</title>
    
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
  <h1>State Create</h1>
<form action="<c:url value='/stateServletCreate'/>" method="post">
	State ID    :<input type="text" name="state_id" value="${form.state_id }"/>
	<span style="color: red; font-weight: 900">${errors.state_id }</span>
	<br/>
	Vaccine Name：<input type="text" name="vaccine_name" value="${form.vaccine_name }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_name }</span>
	<br/>
	Country ID	：<input type="text" name="country_id" value="${form.country_id }"/>
	<span style="color: red; font-weight: 900">${errors.country_id }</span>
	<br/>
	State Name    :<input type="text" name="state_name" value="${form.state_name }"/>
	<span style="color: red; font-weight: 900">${errors.state_name }</span>
	<br/>
	Population    :<input type="text" name="population" value="${form.population }"/>
	<span style="color: red; font-weight: 900">${errors.population }</span>
	<br/>
	Percentage    :<input type="text" name="percentage" value="${form.percentage }"/>
	<span style="color: red; font-weight: 900">${errors.percentage }</span>
	<br/>
	<input type="submit" value="Create State"/>
</form>
  </body>
</html>
