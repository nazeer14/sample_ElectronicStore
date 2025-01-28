package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		HttpSession session=req.getSession();
		if(session==null)
		{
			req.setAttribute("msg", "Session Expiered");
			RequestDispatcher rd=req.getRequestDispatcher("Admin.html");
			rd.forward(req, res);
		}
		else
		{
			ProductBean pbean=new ProductBean();
			
			pbean.setpCode(req.getParameter("pcode"));
			pbean.setpName(req.getParameter("pname"));
			pbean.setpCompany(req.getParameter("pcomp"));
			pbean.setpPrice(req.getParameter("price"));
			pbean.setpQty(req.getParameter("pqty"));
			
			int rowCount=new AddProductDAO().AddProduct(pbean);
			
			if(rowCount>0)
			{
				req.setAttribute("data", "Product Added Successfully..");
				RequestDispatcher rd=req.getRequestDispatcher("AddProduct.jsp");
				rd.forward(req, res);
			}
			else {
				req.setAttribute("data", "Product Not Added.");
				RequestDispatcher rd=req.getRequestDispatcher("AddProduct.jsp");
				rd.forward(req, res);
			}
					
		}
	}

}
