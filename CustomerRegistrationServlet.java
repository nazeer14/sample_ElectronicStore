package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCustomer")
public class CustomerRegistrationServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		CustomerBean cb=new CustomerBean();
		cb.setUname(req.getParameter("ncuname"));
		cb.setPassword(req.getParameter("ncpwd"));
		cb.setFisrtname(req.getParameter("nfname"));
		cb.setLastname(req.getParameter("nlname"));
		cb.setAddress(req.getParameter("naddress"));
		cb.setMailid(req.getParameter("nMailid"));
		cb.setPhoneno(req.getParameter("nPhoneno"));
		
		int rowCount=new CustomerRegisterDAO().addCustomer(cb);
		if(rowCount>0)
		{
			req.setAttribute("msg", "Registration Success.");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerRegister.jsp");
			rd.forward(req, res);
		}
		else {
			req.setAttribute("msg", "Registration Unsuccess!");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerRegister.jsp");
			rd.forward(req, res);
			
		}
		
	}

}
