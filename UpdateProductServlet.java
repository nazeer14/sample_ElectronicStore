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

@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
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
//			String pcode=req.getParameter("code");
//			ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("products");
//			ProductBean pb=null;
//			Iterator<ProductBean> i=al.iterator();
//			while(i.hasNext())
//			{
//				pb=i.next();
//				if(pcode.equals(pb.getpCode()))
//				{
//					break;
//				}
//			}
			ProductBean pb=new ProductBean();
			String pcode=req.getParameter("code");
			String pname=req.getParameter("name");
			String pcomp=req.getParameter("pcom");
			String price=req.getParameter("price");
			String pqty=req.getParameter("qty");
			
			//System.out.println(pcode+""+pname+""+pcomp+" "+price+" "+pqty);
			
			pb.setpCode(pcode);
			pb.setpName(pname);
			pb.setpCompany(pcomp);
			pb.setpPrice(price);
			pb.setpQty(pqty);
			
			int rowCount=new EditProductDAO().updateProduct(pb);
			
			if(rowCount==0)
			{
				System.out.println("Not updated");
				req.setAttribute("msg", "Data Not Updated!");
				RequestDispatcher rd=req.getRequestDispatcher("UpdateProduct.jsp");
				rd.forward(req, res);
				
			}
			else {
				System.out.println("Updated");
				req.setAttribute("msg", "Product Deatils Updated.");
				RequestDispatcher rd=req.getRequestDispatcher("UpdateProduct.jsp");
				rd.forward(req, res);
			}
		}
		
		
		
	}

}
