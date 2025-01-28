package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/clogin")
public class CustomerLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		CustomerBean cb=null;
		String uname=req.getParameter("cname");
		String password=req.getParameter("cpwd");
		cb=new CustomerLoginDAO().getData(uname, password);
		if(cb==null)
		{
			req.setAttribute("msg", "Invalid User Credentials");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
		}
		else
		{
			HttpSession session=req.getSession();
			session.setAttribute("cbean", cb);
			RequestDispatcher rd=req.getRequestDispatcher("CustomerHome.jsp");
			rd.forward(req, res);
			
		}
	}

}
