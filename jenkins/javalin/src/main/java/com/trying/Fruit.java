package com.trying;

import java.util.Objects;

public class Fruit {
		
	private int id;
	private String name;
	private boolean berry;
	
	
	
	
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isBerry() {
		return berry;
	}
	public void setBerry(boolean berry) {
		this.berry = berry;
	}
	@Override
	public int hashCode() {
		return Objects.hash(berry, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return berry == other.berry && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", berry=" + berry + "]";
	}
	public Fruit(int id, String name, boolean berry) {
		super();
		this.id = id;
		this.name = name;
		this.berry = berry;
	}
	public Fruit(String name) {
		this(0,name,false);
	}
	
	
	
		
}
