package com.revature.inheritance;

public class InheritanceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object o = new Object();
		o = new Animal();
		o = new Human();
		o = new SuperHero();
		
		
		
		Animal a = new Animal();
		a = new Human();
		a = new SuperHero();
		a.move();
		a.name="Wolf";
		
		Human h = new Human();
		h = new SuperHero();
		h.move();
		h.name="Deli";
		h.doTaxes();
		
		
		SuperHero sh = new SuperHero();
		sh.move();
		sh.name = "Gaz Man";
		sh.toString();
		sh.doTaxes();

	}

}
