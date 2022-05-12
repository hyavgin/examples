package com.revature.polymorphism;

public class HyperCar extends Car {
	
	public HyperCar() {
		this("cartcurt",0,150); // calling our own all-args constructor 
	}
	public HyperCar(String name, double maxSpeed, double milage) {
		super(milage,name,maxSpeed); //calling the parent car constructor
		
	}
	
	
	
	
	@Override
	public void accelerate() {
		System.out.println("Accelerate like a Hyper car");
	}
	@Override
	public void brake() {
		//The way we refer to our parent class is by using the "super' keyword
		 super.brake();
		System.out.println("I'm braking even harder");
	}
	public void drift() {// with help of "super" I can use both my parent's brake and accelerate mathods. for Reuse the code 
		super.brake();
		super.accelerate();
		
	}
	//When we "super " anywhere, always think parent!
	//with super, we can invoke the parents methods, constructors and access parent variable  
	public void donutsInTheParkingLot() {
		super.brake(); //parent
		this.brake(); //"My" method
		
	}
	


}
