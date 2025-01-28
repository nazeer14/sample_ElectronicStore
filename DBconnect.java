package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	private static Connection con=null;
	private DBconnect()
	{
		
	}
	static {
		try {
			con=DriverManager.getConnection(DBinfo.URL,DBinfo.USER,DBinfo.PASSWORD);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getcon() {
		return con;
	}

}
