package com.perfectsquare.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Abrar") && password.equals("ab123");
	}

}
