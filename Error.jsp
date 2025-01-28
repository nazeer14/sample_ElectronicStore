<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><center>
<h2>
<%@include file="CustomerProducts2.jsp" %>
<%
	String msg=(String)request.getAttribute("msg");
	out.println(msg+"<br>");
	out.println("Order Not placed..<br>Please be try again!! ");
	
%>


</h2>

</body>
</html>