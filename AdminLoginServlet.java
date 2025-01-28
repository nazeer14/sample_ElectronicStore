package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Alogin")
public class AdminLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		String uname=req.getParameter("auname");
		String pwd=req.getParameter("apwd");
		AdminBean ab=new AdminLoginDAO().checkAdmin(uname,pwd);
		
		if(ab==null)
		{
			req.setAttribute("msg", "Invalid Admin Credentials");
			RequestDispatcher rd=req.getRequestDispatcher("admin.html");
			rd.forward(req, res);
		}
		else
		{
			HttpSession session=req.getSession();
			session.setAttribute("abean", ab);
			RequestDispatcher rd=req.getRequestDispatcher("AdminHome.jsp");
			rd.forward(req, res);
			
		}
	}

}
