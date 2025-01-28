package com.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/update2")
public class UpdateBuyProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session experied!!");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.forward(req, res);
			
		}
		else {
			String pcode=req.getParameter("pcode");
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("products");
			ProductBean pb2=null;
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext())
			{
				pb2=i.next();
				if(pcode.equals(pb2.getpCode()))
				{
					break;
				}
			}			
			ProductBean pb=new ProductBean();
			//System.out.println(pcode);
			pb.setpCode(pcode);
			pb.setpName(req.getParameter("name"));
			pb.setpCompany(req.getParameter("pcom"));
			pb.setpPrice(req.getParameter("price"));
			pb.setpQty(req.getParameter("qty"));
			
			int q1=Integer.parseInt(pb2.getpQty());
			int q2=Integer.parseInt(pb.getpQty());
			//System.out.println(q1);
			String uqty=String.valueOf(q1-q2);
			//System.out.println(uqty);
			if(q2<=q1) 
			{
				int rowCount=new UpdateBuyProductDAO().update(uqty, pb);
				if(rowCount==0)
				{
					//System.out.println("Not updated");
					req.setAttribute("msg", "Somthing went wrong !!!");
					RequestDispatcher rd=req.getRequestDispatcher("Error.jsp");
					rd.forward(req, res);
					
				}
				else {
					//System.out.println("Updated");
					int price=Integer.parseInt(pb.getpPrice());
					price=price*q2;
					req.setAttribute("msg",price);
					RequestDispatcher rd=req.getRequestDispatcher("BuyDetails.jsp");
					rd.forward(req, res);
				}
			}
			else {
				req.setAttribute("msg", "Warning: Quantity is Not more Then Product Quantity");
				RequestDispatcher rd=req.getRequestDispatcher("Error.jsp");
				rd.forward(req, res);
			}
		}
	}
}
