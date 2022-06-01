package com.revature;

import com.revature.interfaces.java8.JustDoesOneThing;
import com.revature.interfaces.java8.UnnecessryClass;

public class MainDriver {

	public static void main(String[] args) {
		JustDoesOneThing j = new UnnecessryClass();
		j.justTheoneThing("Ahmet bismillah der", 35);

	
	
	
	JustDoesOneThing j2 =(String s, int i) ->{
		System.out.println(s + " ," + i);
	};
	j2.justTheoneThing("Yok artikkk", 45);
}
}