package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProductDAO {

	public int deleteProduct(String pcode)
	{
		int rowCount=0;
		try {
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("delete from product where PCODE=?");
			ps.setString(1, pcode);
			rowCount=ps.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
}
