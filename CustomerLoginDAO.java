package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO {
	
	public CustomerBean getData(String uname,String password)
	{
		CustomerBean cb=null;
		try {
			Connection con=DBconnect.getcon();
			PreparedStatement ps=con.prepareStatement("select * from customer where uname=? and PWORD=?");
			ps.setString(1, uname);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				cb=new CustomerBean();
				cb.setUname(rs.getString(1));
				cb.setPassword(rs.getString(2));
				cb.setFisrtname(rs.getString(3));
				cb.setLastname(rs.getString(4));
				cb.setAddress(rs.getString(5));
				cb.setMailid(rs.getString(6));
				cb.setPhoneno(rs.getString(7));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cb;
	}

}
