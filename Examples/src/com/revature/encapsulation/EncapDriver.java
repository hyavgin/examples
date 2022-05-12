package com.revature.encapsulation;

public class EncapDriver {
	
	
	/*java achieves encapsulation via Access modifer keywords
	 * in order of least secure to most secure:
	 * 
	 * 
	 * get it from Ben's github lesson notes.
	 * 
	 * */
	public static void main(String...kiwi) {
		User user = new User("Osman", "de");
	//  System.out.println(user.getUsername()+user.getPassword());
		
		user.setUsername("boby");
		//user.setPassword(null);
		user.setPassword("bilemezzzzzzzzzzzzz");
		//System.out.println(user.getUsername()+user.getPassword());

	}
	
}
