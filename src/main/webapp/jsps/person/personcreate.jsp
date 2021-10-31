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
  <h1>person Create</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">
	person_id    :<input type="text" name="person_zip_code" value="${form.person_id }"/>
	<span style="color: red; font-weight: 900">${errors.person_id }</span>
	<br/>
	vaccine_name ：<input type="vaccine_name" name="vaccine_name" value="${form.vaccine_name }"/>
	<span style="color: red; font-weight: 900">${errors.vaccine_name }</span>
	<br/>
	person_zip_code	：<input type="text" name="person_zip_code" value="${form.person_zip_code }"/>
	<span style="color: red; font-weight: 900">${errors.person_zip_code }</span>
	<br/>
	person_name	：<input type="text" name="person_name" value="${form.person_name }"/>
	<span style="color: red; font-weight: 900">${errors.person_name }</span>
	<br/>
	person_age ：<input type="text" name="person_age" value="${form.person_age }"/>
	<span style="color: red; font-weight: 900">${errors.person_age }</span>
	<br/>
	<input type="submit" value="Create Entity1"/>
</form>
  </body>
</html>
