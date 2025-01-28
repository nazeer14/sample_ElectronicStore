<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body><center>
<%@include file="CustomerLogin.html" %>
	<%
		String msg=(String)request.getAttribute("msg");
		out.println("<h2>"+msg+"</h2><br>");
	%>

</body>
</html>