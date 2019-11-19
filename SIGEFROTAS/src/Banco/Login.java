/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author matheusikenaga
 */
public class Login
{
	private int ID_LOGIN;
	private String LOGIN_USER; 
        private String PW_USER;
        private String EMAIL_USER;
        private java.sql.Date DT_NASC_USER;
        
        
	public int getID_LOGIN()
	{
		return this.ID_LOGIN;
	}
	public void setID_LOGIN(int value)
	{
		this.ID_LOGIN = value;
	}


	public String getLOGIN_USER()
	{
		return this.LOGIN_USER;
	}
	public void setLOGIN_USER(String value)
	{
		this.LOGIN_USER = value;
	}

	
	public String getPW_USER()
	{
		return this.PW_USER;
	}
	public void setPW_USER(String value)
	{
		this.PW_USER = value;
	}

	
	public String getEMAIL_USER()
	{
		return this.EMAIL_USER;
	}
	public void setEMAIL_USER(String value)
	{
		this.EMAIL_USER = value;
	}

	
	public java.sql.Date getDT_NASC_USER()
	{
		return this.DT_NASC_USER;
	}
	public void setDT_NASC_USER(java.sql.Date value)
	{
		this.DT_NASC_USER = value;
	}

}
