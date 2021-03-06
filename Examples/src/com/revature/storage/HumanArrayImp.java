package com.revature.storage;

import com.revature.models.Human;

public class HumanArrayImp implements HumanArray {
	
	Human[] humanArray;

	@Override
	public void addHumans(Human h) {
		// TODO Auto-generated method stub
		humanArray = new Human[2];
		boolean isThereSpace = false;
		
		//Check if there is space and add human!
		for(int i = 0; i< this.humanArray.length; i++) {
			if(humanArray[i] == null) {
				isThereSpace=true;
				humanArray[i] = h;
				break; //break out of the loop!
			}
		}
		
		if(isThereSpace) {
//			System.out.println("Great! Our job is done!");
		}else {
			//make a new empty array with double length
			Human[] newArray = new Human[this.humanArray.length*2]; 
			
			//fill up the new array with the old array Humans
			for(int i = 0; i< this.humanArray.length; i++) {
				newArray[i] = this.humanArray[i];
			}
			
			this.humanArray = newArray; //replace the old array with the brand new bigger array!
			
			//add extra human
			for(int i = 0; i< this.humanArray.length; i++) {
				if(humanArray[i] == null) {
					isThereSpace=true;
					humanArray[i] = h;
					break; //break out of the loop!
				}
			}
			
			//execute the same method?
			//this.addHuman(h);
		
		}
		
	}
	@Override
	public Human findHumanByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeHumanByName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	public void printAllTheHumans() {
		
	
		for (Human h:this.humanArray) {
			if(h!= null) {
				System.out.println(h.getName());
			}
		}

}
}
