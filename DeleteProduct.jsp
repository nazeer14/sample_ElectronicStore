<%@page import="com.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
<center><h2>
<%
	AdminBean ab=(AdminBean)session.getAttribute("abean");
	String msg=(String)request.getAttribute("msg");
	out.println("Hello "+ab.getFname()+"<br><br>");
	out.println(msg+"<br><br>");
	
	//response.sendRedirect("AdminHome.jsp");
	
	RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
	rd.include(request, response);
%>

</h2>

</body>
</html>