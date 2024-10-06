package abstractdemo1;

public abstract class Vehicle {

	private String name;

	public Vehicle(String name) {
         this.name=name;
	}

	public String getName() {
		return name;
	}
	
	abstract void start();
	
	public void stop() {
		System.out.println(name+" : CAR STOP");
	}
	
	
	

}
