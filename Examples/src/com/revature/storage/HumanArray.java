package com.revature.storage;

import com.revature.models.Human;

public interface HumanArray {
	public abstract void addHumans(Human h);
	
	public abstract Human findHumanByName(String name);
	
	public abstract void removeHumanByName(String name);
	

}

