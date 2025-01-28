<%@page import="com.pack1.ProductBean"%>
<%@page import="com.pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
body{ align-content: flex-start;
background-image: url("https://img.freepik.com/free-vector/realistic-style-technology-particle-background_23-2148426704.jpg");
background-repeat: no-repeat;
background-size: 100%;}
h1{
color:gold;
}
.head{
color:red;
background-image: url("https://img.freepik.com/free-vector/realistic-style-technology-particle-background_23-2148426704.jpg");
}
h2{
text-align: center;
color: white;
font-size: 30px;
}
  .b1{
    align-items: center;
    padding: 5px 50px;
    font-size: medium;
    border-radius: 20px;
    color: white;
    background-color: green;
    border-color: chocolate;
  } 
  .input{
  color:orange;
  font-size: 25px;
  background: transparent;
  text-align: center;
  }
</style>
<title>Buy</title>
</head>
<body><center>
	<h1 class="head">NOC Electronic Store</h1>
	<h1>Product Deatils</h1>
		<form id="form-1"  action="update2" method="post">
		<h2>
		
	<%
		CustomerBean cb=(CustomerBean)session.getAttribute("cbean");
		ProductBean pb=(ProductBean)request.getAttribute("pbean");
		out.println("hello "+cb.getFisrtname()+" ,These are the Product deatils.<br>");
		out.println("<input type='hidden' name='pcode' value="+pb.getpCode()+"><br>");
		out.println("Product Name <br> <input class='input' type='text' name='name' value='"+pb.getpName()+"' readonly><br>");
		out.println("Company <br> <input class='input' type='text' name='pcom' value='"+pb.getpCompany()+"'readonly><br>");
		out.println("Price <br> <input class='input' type='text' name='price' value='"+pb.getpPrice()+"'readonly><br>");
		out.println("Quantity <br> <input class='input' type='text' name='qty' value='"+pb.getpQty()+"'><br><br>");
			
	%>
	<!-- 
		product price <input type="text" name="pPrice" value="<%=pb.getpPrice() %>"><br>
		Product Quantity <input type="text" name="pqty" value="<%=pb.getpQty() %>"><br>
		<input type="hidden" name="code" value="<<%= pb.getpCode() %>"><br>
	 -->
	<input class="b1"type="submit" Value="Buy">
	</h2></form>

</body>
</html>