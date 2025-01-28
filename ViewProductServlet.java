package com.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/View1")
public class ViewProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session experied!!");
			RequestDispatcher rd=req.getRequestDispatcher("Admin.html");
			rd.forward(req, res);
			
		}
		else{
			ArrayList<ProductBean> al=new ViewProductDAO().reteriveProducts();
			session.setAttribute("products", al);
			RequestDispatcher rd=req.getRequestDispatcher("AdminProducts2.jsp");
			rd.forward(req, res);
			
		}
		
	}
	

}
