package oops_practice;

public class Vehicle {

	int engine;
	String color;
	
	
	public Vehicle(int engine, String color) {
		super();
		this.engine = engine;
		this.color = color;
	}
	
	
	public void print() {
		
		System.out.println("vehicle method invoked");
		System.out.println(engine);
		System.out.println(color);
	}
	
	
	

}
