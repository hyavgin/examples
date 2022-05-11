
public class Dog {
	String breed;
	String size;
	int age;
	String color;
	boolean doRun;

	public String getInfo(){
		return("Breed is:" + breed + " Size is:" + size + " Age is: " + age + " Color is: " + color);
	
	}	
	public String run() {
		doRun = true;
		return(breed + " is run" + doRun);

	}

}

