package com.revature.polymorphism;

public class Car {
	public double millage;
	public String name;
	public double maxSpeed;
	
	public Car() {
		//this(0, "something wrong", 150); **********************
		/* I still would like to instantiate the car based on some dummy values
		this.maxSpeed = 150;
		this.millage = 0;
		this.name = "something wrong";
		*/
		
		
	}
	//Parametirized Constructor
	public Car(double milage, String name, double maxSpeed) {
		//this() or super() has to be top of the code block!
		this.millage = milage;
		this.name=name;
		this.maxSpeed=maxSpeed;
	}
	
	
	public void accelerate() {
		System.out.println("accelerating normal car ");
		
	}
	public void brake() {
		
		
	}
	public void steer() {
		
	}

}
