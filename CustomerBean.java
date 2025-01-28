package com.pack1;

import java.io.Serializable;

public class CustomerBean implements Serializable
{
	private String uname,password,fisrtname,lastname,address,mailid,phoneno;
	
	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFisrtname() {
		return fisrtname;
	}



	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getMailid() {
		return mailid;
	}



	public void setMailid(String mailid) {
		this.mailid = mailid;
	}



	public String getPhoneno() {
		return phoneno;
	}



	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}



	public CustomerBean()
	{
		
	}

}
