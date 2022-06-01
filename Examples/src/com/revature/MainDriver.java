package com.revature;

import com.revature.models.Human;
import com.revature.storage.HumanArrayImp;

public class MainDriver {
	
	String name;
	int age;
	
	
	
	public static void main(String... apples ) {
		/*
		HumanArrayImp hArray = new HumanArrayImp();
		hArray.addHumans(new Human("Ali",2));
		hArray.addHumans(new Human("Ali",2));
		hArray.addHumans(new Human("Ali",2));
		hArray.addHumans(new Human("Ali",2));
		hArray.addHumans(new Human("Ali",2));
		hArray.addHumans(new Human("Ali",2));
		hArray.printAllTheHumans();
		*/
		//Human[] basicArray = new Human[10];
		
		MainDriver md = new MainDriver();
		
		md.setName("Ali");
		md.setAge(15);
		md.setName("Hamza");
		md.setAge(25);
	
		
	}
	public void setName(String name) {
		
		
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getNAme() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
}
