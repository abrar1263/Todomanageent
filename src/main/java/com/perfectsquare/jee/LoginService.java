package com.perfectsquare.jee;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Abrar") && password.equals("Sama");
	}

}
