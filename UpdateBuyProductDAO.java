package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateBuyProductDAO 
{
	public int update(String pqty,ProductBean pb)
	{
		int rowCount=0;
		try {
			//System.out.println("connect");
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("update product set pqty=? where pcode=?");
			
			ps.setString(1, pqty);
			ps.setString(2, pb.getpCode());
			
			rowCount=ps.executeUpdate();
			}
		catch(Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return rowCount;
}

}
