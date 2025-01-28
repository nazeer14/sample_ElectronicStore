package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewCustomerProductsDAO 
{
	ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	public ArrayList<ProductBean> reteriveData(){
	try {
		Connection con=DBconnect.getcon();
		PreparedStatement ps=con.prepareStatement("select * from products");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			ProductBean pb=new ProductBean();
			pb.setpCode(rs.getString(1));
			pb.setpName(rs.getString(2));
			pb.setpCompany(rs.getString(3));
			pb.setpPrice(rs.getString(4));
			pb.setpQty(rs.getString(5));
			
			al.add(pb);
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return al;
	}
	
}
