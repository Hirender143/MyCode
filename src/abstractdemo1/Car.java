package abstractdemo1;

public class Car extends Vehicle {
          
	public Car(String name) {
		super(name);
	}

	public void start() {
		System.out.println(" CAR START() INVOKED");
		System.out.println(super.getName()+" : GADDI START");
	}
	
}
