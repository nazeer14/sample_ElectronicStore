package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerRegisterDAO
{
	public int addCustomer(CustomerBean cb)
	{
		int rowCount=0;
		try {
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			ps.setString(1, cb.getUname());
			ps.setString(2, cb.getPassword());
			ps.setString(3, cb.getFisrtname());
			ps.setString(4, cb.getLastname());
			ps.setString(5, cb.getAddress());
			ps.setString(6, cb.getMailid());
			ps.setString(7, cb.getPhoneno());
			
			rowCount=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	return rowCount;
	}
	

}
