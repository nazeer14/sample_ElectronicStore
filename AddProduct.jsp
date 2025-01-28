<%@page import="com.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
</head>
<body>
<center>
<h2>
	<%
		AdminBean ab=(AdminBean)session.getAttribute("abean");
		String msg=(String)request.getAttribute("data");
		out.println("<br>Hello "+ab.getFname()+" "+msg+"<br><br>");
		RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
		rd.include(request, response);
	%>
</h2>
</body>
</html>