<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1><b>Project description</b></h1>
    <hr>
    <p>This project is based on vaccination drive. Recently we faced a global pandemic that really brought out the unpreparedness of humans collectively for disease that are easily spread. But it also showed that the magnitude and scalibility of development we can achieve in such a short period of time. The project expands on the same idea.</p>
    <hr>
    <p>Vaccines are generally produced by pharamaceutical companies. After vaccines are manufactured and set the intital cost of vaccine, countries can order the number of vaccines they require. Each country can have multiple requirements for different kinds of vaccine(eg covid, malaria, dengue, hepatitis) and every country can set a different price of vaccines. country entity has attributes like name, id, vaccination percentage, population etc. Countries have various states/provinces. Each state controls the price of the vaccine and has attributes similar to that of a country. Zip codes are sub parts of a state to better manage the data at hand. The entity zip code too have similar attributes as that of state. person entity has their ID, name, address and the vaccination status for each. order entity describes the order placed by a country for it's population. DESCRIPTION is updated in an iterative manner similar to an interative waterfall model.</p>
    
  </body>
</html>
