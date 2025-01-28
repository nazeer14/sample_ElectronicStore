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
th:hover {background-color: coral;}

.head{
background-image: url("https://tse1.mm.bing.net/th?id=OIP.5pvlM2oWX-xYRTiUbcfVEAHaEK&pid=Api&P=0&h=220");
}
a{
 	
	color:gold;
}
a:hover {
	background: highlight;
}
</style>
<title>Insert title here</title>
</head>
<body style="padding: 0px 0px 0px 0px;  color:blue; background-image: url('https://tse3.mm.bing.net/th?id=OIP.o0-_5Yz2Vr32GtIPXUKTLQHaEo&pid=Api&P=0&h=220'); background-size: 100%; background-repeat: no-repeat;"><center>
<marquee class="mq">NOC Electronic Store</marquee>
	<h1 class="head" style="padding: 5px 15px 10px 100px; color: yellow; ">NOC Electronic Store</h1>
<div class="table">
	<table style="border: 2px solid; border-color: white; color: white; font-size: 20px; text-align: center; height:  " >
	<thead style="color: red; font-size: 30px;background-color:pink; padding: 10px 10px 10px 10px;">
	<tr>
	<th>&nbspCode &nbsp</th>
	<th>&nbsp Name &nbsp</th>
	<th>&nbsp Compnay &nbsp</th>
	<th>&nbsp Price &nbsp</th>
	<th>&nbsp Quantity &nbsp</th>
	<th>&nbsp Buy &nbsp</th>
	</tr>
	</thead>
		<%
		CustomerBean ab=(CustomerBean)session.getAttribute("cbean");
		ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("products");
		out.println("<h1><u>Hello "+ab.getFisrtname()+" , these are the product deatils.</u></h1><br><br>");
		if(al.size()>0)
		{
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext())
			{
				ProductBean pb=i.next();
				//out.println(pb.getpName()+" --> "+pb.getpCompany()+" --> "+pb.getpPrice()+" --> "+pb.getpQty()
				//+"--> <a href='Buy?pcode="+pb.getpCode()+"'> Buy</a><br><br>");
				out.println("<tbody style='background-color:black;'>");
				out.println("<tr>");
				out.println("<td>"+pb.getpCode()+"</td>");
				out.println("<td>"+pb.getpName()+"</td>");
				out.println("<td>"+pb.getpCompany()+"</td>");
				out.println("<td>"+pb.getpPrice()+"</td>");
				out.println("<td>"+pb.getpQty()+"</td>");
				out.println("<td><a href='Buy?pcode="+pb.getpCode()+"'>Buy</a></td>");
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
<a style="font-size: 20px; color:black; " href="logout">Logout</a>

</body>
</html>