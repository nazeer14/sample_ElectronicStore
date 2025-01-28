package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO 
{
	public AdminBean checkAdmin(String uname,String pwd)
	{
		AdminBean abean=null;
		try {
			Connection con=DBconnect.getcon();
			System.out.println("Coneected");
			PreparedStatement ps=con.prepareStatement("select * from admin where uname=? and pword=?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				abean=new AdminBean();
				
				abean.setUname(rs.getString(1));
				abean.setPwd(rs.getString(2));
				abean.setFname(rs.getString(3));
				abean.setLname(rs.getString(4));
				abean.setAddress(rs.getString(5));
				abean.setMailid(rs.getString(6));
				abean.setPhoneno(rs.getString(7));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return abean;
	}

}
