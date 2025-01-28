<%@page import="com.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>Admin Home</title>
</head>
<body>
<body style="background-image: url('https://tse2.mm.bing.net/th?id=OIP.kVzY4MtEI9Bgp4bTzwz9bQHaCs&pid=Api&P=0&h=220'); background-position: top; background-size: 100%;background-repeat: repeat; color: yellow;">
<center>
<marquee class="mq">NOC Electronic Store</marquee>
	<h1 style="background-image: url('https://tse4.mm.bing.net/th?id=OIP.RZewLeFqnEWTM5_qhIPhDAHaFP&pid=Api&P=0&h=220'); color:white; font-size: 45px; " align="center">NOC Electronic Store</h1><br>

<%
	AdminBean abean=(AdminBean)session.getAttribute("abean");
	out.println("<h2 class='btn'>Welcome "+abean.getFname()+" !!!</h2><br><br><br>");
%>
<h2>
<a style="color: white; background-color: green; border-radius: 8px;font-family: monospace; padding: 10px 20px 10px 20px;" href="AddProduct.html">Add Product</a>
<a style="color: white; background-color: green;border-radius: 8px; font-family: monospace;padding: 10px 20px 10px 20px;" href="View1">View Products</a><br><br><br>
<a style="color: white; background-color: red;border-radius: 8px; font-family: monospace; font-size: 25px;" href="logout">Logout</a></h2>

</body>
</html>