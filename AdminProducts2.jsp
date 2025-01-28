<%@page import="com.pack1.AdminBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pack1.CustomerBean"%>
<%@page import="com.pack1.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body{
background-image: url('https://tse4.mm.bing.net/th?id=OIP.q1IFTEeTmk-jWWXZ6umqNwHaEo&pid=Api&P=0&h=220');
background-repeat: no-repeat;;
background-size: 100%;
}

td:hover {
border-color: black;}
.head{
background-image: url("https://tse1.mm.bing.net/th?id=OIP.5pvlM2oWX-xYRTiUbcfVEAHaEK&pid=Api&P=0&h=220");
}
h1{
color:white;}
a{
	color:gold;
}
a:hover{background-color:highlighttext;}
table ,th{border: 2px solid black;}
td{
border: 1px solid gold;}
</style>
<title>Insert title here</title>
</head>
<body><center>
<marquee class="mq">NOC Electronic Store</marquee>
	<h1 class="head" style="padding: 5px 15px 10px 100px; color: yellow; ">NOC Electronic Store</h1>
<div class="table">
	<table style=" color: white; font-size: 20px; text-align: center; " >
	<thead style="border: 2px solid; color: aqua; font-size: 30px;background-image:url('https://tse4.mm.bing.net/th?id=OIP.q1IFTEeTmk-jWWXZ6umqNwHaEo&pid=Api&P=0&h=220'); ">
	<tr style="position: static;">
	<th>&nbsp Code</th>
	<th>&nbsp Name</th>
	<th>&nbsp Compnay</th>
	<th>&nbsp Price</th>
	<th>&nbsp Quantity</th>
	<th>&nbsp Edit</th>
	<th>&nbsp Delete</th>
	</tr>
	</thead>
		<%
		AdminBean ab=(AdminBean)session.getAttribute("abean");
		ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("products");
		out.println("<h1><u>Hello "+ab.getFname()+" , these are the product deatils.</u></h1><br><br>");
		if(al.size()>0)
		{
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext())
			{
				ProductBean pb=i.next();
				//out.println(pb.getpName()+" --> "+pb.getpCompany()+" --> "+pb.getpPrice()+" --> "+pb.getpQty()
				//+"--> <a href='Buy?pcode="+pb.getpCode()+"'> Buy</a><br><br>");
				out.println("<tbody>");
				out.println("<tr>");
				out.println("<td>&nbsp"+pb.getpCode()+"</td>");
				out.println("<td>&nbsp"+pb.getpCompany()+"</td>");
				out.println("<td>&nbsp"+pb.getpPrice()+"</td>");
				out.println("<td>&nbsp"+pb.getpName()+"</td>");
				out.println("<td>&nbsp"+pb.getpQty()+"</td>");
				out.println("<td>&nbsp<a href='Edit?pcode="+pb.getpCode()+"'>Edit</a></td>");
				out.println("<td>&nbsp<a href='delete?pcode="+pb.getpCode()+"'>Delete</a></td>");
				out.println("</tr>");
			}
		}
		else{
			out.println("Products are NOT available.");
		}		
		
	%>
	</tbody>
	</table>
</div><br><br>
<a style="font-size: 20px; color:yellow; " href="logout">Logout</a>

</body>
</html>