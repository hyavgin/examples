package com.revature.encapsulation;

public class User {
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
		
	}
	public String getPassword() {
		return this.password;
		
	}
	public void setUsername(String newUsername) {
		 this.username = newUsername;
	}
	public void setPassword(String newPassword) {
		if(newPassword == null) {
			System.out.println("Can not be empty!");
		}
		else if(newPassword.length()>7) {
			this.password = newPassword;
		}else {
			System.out.println("New Password is not long enough!");
		}
	}
}
