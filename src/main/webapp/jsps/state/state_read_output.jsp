<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Read Entity Output</title>
    
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
  <h1>Read Entity Output</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
	State ID    :<input type="text" name="state_id" value="${state.state_id }" disabled/>
	<br/>
	Vaccine Name：<input type="text" name="vaccine_name" value="${state.vaccine_name }" disabled/>
	<br/>
	Country ID	：<input type="text" name="country_id" value="${state.country_id }" disabled/>
	<br/>
	State Name	：<input type="text" name="state_name" value="${state.state_name }" disabled/>
	<br/>
	Population	：<input type="text" name="population" value="${state.population }" disabled/>
	<br/>
	Percentage	：<input type="text" name="percentage" value="${state.percentage }" disabled/>
	<br/>
</form>

<button onclick="window.location.href='<c:url value='/jsps/main.jsp'/>'">Continue</button>
</body>
</html>
