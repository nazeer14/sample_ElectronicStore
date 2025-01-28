<%@page import="com.pack1.AdminBean"%>
<%@page import="com.pack1.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{background-image: url("https://tse2.mm.bing.net/th?id=OIP.YlyYObQ2Bx6c-uDWA2tIPQHaEK&pid=Api&P=0&h=220");
background-size: 100%;
background-repeat: no-repeat;
}
h1{color: rgb(102,255,153);}
h2{color:#00e6e6;
font-size: 30px;}
 .input{
  color: #ffff33;
  font-size: 25px;
  background: #FFE6B3;
  background-image:url("https://tse3.mm.bing.net/th?id=OIP.OTvPQ0xgj-u1x2OPkk-y7wHaE7&pid=Api&P=0&h=220");
  background-size:50%;
  text-align: center;
  }
  .b1{
    align-items: center;
    padding: 5px 50px;
    font-size: medium;
    border-radius: 20px;
    color: black;
    background-color: rgb(204,255,255);
    border-color: chocolate;
  } .head{
color:gold;
background-image: url("https://img.freepik.com/free-vector/realistic-style-technology-particle-background_23-2148426704.jpg");
}
p{color: rgb(25,255,25);}
</style>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
	<center><h1 class="head">NOC Electronic Store(Admin Area)</h1>
	<h1>Edit Product Deatils</h1>
		<form id="form-1" action="update" method="post">
		<h2>
		
	<%
		AdminBean ab=(AdminBean)session.getAttribute("abean");
		ProductBean pb=(ProductBean)request.getAttribute("pbean");
		out.println("<p>hello "+ab.getFname()+", update "+pb.getpName()+" deatils.</p>");
		out.println("<input type='hidden' name='code' value="+pb.getpCode()+">");
		out.println("Name&nbsp&nbsp&nbsp &nbsp&nbsp <input class='input' type='text' name='name' value='"+pb.getpName()+"'><br>");
		out.println("<br>Company  <input class='input' type='text' name='pcom' value='"+pb.getpCompany()+"'><br>");
		out.println("<br>Price &nbsp &nbsp &nbsp &nbsp  <input class='input' type='text' name='price' value='"+pb.getpPrice()+"'><br>");
		out.println("<br>Quantity  <input class='input' type='text' name='qty' value='"+pb.getpQty()+"'><br><br>");
			
	%>
	<!-- 
		product price <input type="text" name="pPrice" value="<%=pb.getpPrice() %>"><br>
		Product Quantity <input type="text" name="pqty" value="<%=pb.getpQty() %>"><br>
		<input type="hidden" name="code" value="<<%= pb.getpCode() %>"><br>
	 -->
	<input class ="b1"; type="submit" Value="Update">
	</h2></form>
</body>
</html>