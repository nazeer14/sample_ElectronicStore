<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body><h2>
	<%
		session.invalidate();
		out.println("Logout successfully.");
	%>
	<a href="index.html">Login</a></h2>
</body>
</html>