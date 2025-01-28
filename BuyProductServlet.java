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

@WebServlet("/Buy")
public class BuyProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession session=req.getSession(false);
		
		if(session==null) {
			req.setAttribute("msg", "Session is Expiered!");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.forward(req, res);
		}else {
			String pcode=req.getParameter("pcode");
			//System.out.println(pcode);
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("products");
			ProductBean pb=null;
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext())
			{
				pb=i.next();
				if(pcode.equals(pb.getpCode()))
				{
					//System.out.println("Break");
					break;
				}
			}
			req.setAttribute("pbean", pb);
			RequestDispatcher rd=req.getRequestDispatcher("BuyProduct.jsp");
			rd.forward(req, res);
			
		}
	}

}
