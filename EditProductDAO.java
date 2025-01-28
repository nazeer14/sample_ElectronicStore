package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EditProductDAO 
{
	public int updateProduct(ProductBean pb)
	{
		int rc=0;
		try {
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("update product set PNAME=?,PCOMPANY=?,PPRICE=?,PQTY=?  where PCODE=?");
			ps.setString(1, pb.getpName());
			ps.setString(2, pb.getpCompany());
			ps.setString(3, pb.getpPrice());
			ps.setString(4, pb.getpQty());
			ps.setString(5, pb.getpCode());
			
			rc=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rc;
	}

}
