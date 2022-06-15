package com.typing.service;

import io.javalin.http.Context;

public class AuthenticateServices {
	
	
	
	public static boolean authenticateUser(String username, String password) {
		
		if(username.equals("Bob")) {
			return true;
		}
		
	return false;
		
	}

}
