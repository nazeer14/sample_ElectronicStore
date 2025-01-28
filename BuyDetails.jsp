<%@page import="com.pack1.ProductBean"%>
<%@page import="com.pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buy</title>
</head>
<body>
<center>
<%@ include file="CustomerHome.jsp" %>
<h2 style="color: gold ; text-align: left; background-image: url('https://tse3.mm.bing.net/th?id=OIP.9-R0v4VGyO5oz56xgIewSQHaEV&pid=Api&P=0&h=220'); ">
	<%
		CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
		int msg=(Integer)request.getAttribute("msg");
		out.println("Hello "+cb.getFisrtname()+"<br>");
		out.println("You have charged <u>"+ msg +" rs</u><br>");
		out.println("Your order is placed successfully...<br><br>");
		out.println("<i>thank you for placing orders in NOC electronic Store</i>");
	%>
	
</h2>
</body>
</html>