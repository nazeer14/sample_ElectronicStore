package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession session=req.getSession(false);
		//session.removeAttribute("abean");
		//req.removeAttribute("aname");
		//session.invalidate();
		//res.sendRedirect("admin.html");
		if(session==null)
		{
			req.setAttribute("msg", "Session experied!!");
			RequestDispatcher rd=req.getRequestDispatcher("Admin.html");
			rd.forward(req, res);
			
		}
		else {
			req.getRequestDispatcher("Logout.jsp").forward(req, res);
		}
		
	}

}
