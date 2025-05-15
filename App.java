package org.app;

import java.util.ResourceBundle;

public class App {
	public int userlogin(String in_user, String in_pwd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("Username");
		String password=rb.getString("Password");
		if(in_user.equals(userName) && in_pwd.equals(password))
			return 1;
		else
			return 0;
	}

}
