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
  <h1>Zip Code Create</h1>
<form action="<c:url value='/zip_codeServletCreate'/>" method="post">
	Zip Code    :<input type="text" name="zip_code" value="${form.zip_code }"/>
	<span style="color: red; font-weight: 900">${errors.zip_code }</span>
	<br/>
	Vaccine Name：<input type="text" name="vaccine_name" value="${form.vaccine_name }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	State ID	：<input type="text" name="state_id" value="${form.state_id }"/>
	<span style="color: red; font-weight: 900">${errors.state_id }</span>
	<br/>
	Percentage	：<input type="text" name="percentage" value="${form.percentage }"/>
	<span style="color: red; font-weight: 900">${errors.percentage }</span>
	<br/>
	Number Of Vaccination Centres	：<input type="text" name="num_vaccination_centres" value="${form.num_vaccination_centres }"/>
	<span style="color: red; font-weight: 900">${errors.num_vaccination_centres }</span>
	<br/>
	<input type="submit" value="Create State"/>
</form>
  </body>
</html>
