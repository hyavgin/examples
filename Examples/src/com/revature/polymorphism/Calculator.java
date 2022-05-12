package com.revature.polymorphism;

public class Calculator {
	/*
	public double add(double[] doubleArray) {
		double total = 0;
		for (int i = 0 ; i< doubleArray.length; i++) {
			total += doubleArray[i];
			
		}
		return total;
	}*/
	
	
	public double add(double...ds) { //var-args we cann pass a variable amount of argument
		double total = 0;
		for(double value: ds) {
			total+=value;
		}
		return total;
	}

}
