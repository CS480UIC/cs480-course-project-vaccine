<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>VACCINE Update</title>
    
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
  <h1>vaccine Update</h1>

<p style="color: red; font-weight: 900">${msg }</p >
<form action="<c:url value='/vaccineServletUpdate'/>" method="post">
 <input type="hidden" name="method" value="vaccine Update"/>
 <!-- Number    :<input type="text" name="number" value="${form.number }"/>
 <span style="color: red; font-weight: 900">${errors.number }</span>
 <br/> -->
 vaccine_name：<input type="text" name="vaccine_name" value="${form.vaccine_name }"/>
 <span style="color: red; font-weight: 900">${errors.vaccine_name }</span>
 <br/>
 temperature ：<input type="text" name="temperature" value="${form.temperature }"/>
 <span style="color: red; font-weight: 900">${errors.temperature }</span>
 <br/>
 vaccine_quantity    :<input type="text" name="vaccine_quantity" value="${form.vaccine_quantity }"/>
 <span style="color: red; font-weight: 900">${errors.vaccine_quantity }</span>
 <br/>
 cost    :<input type="text" name="cost" value="${form.cost }"/>
 <span style="color: red; font-weight: 900">${errors.cost }</span>
 <br/>
 <input type="submit" value="vaccine Update"/>
</form>
  </body>
</html>