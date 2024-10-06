package polymorphism;

public class Circle implements Shape {

	private double r;
	
	

	public Circle(double r) {
		super();
		this.r = r;
	}



	public double calculateArea() {
		// TODO Auto-generated method stub
		return (3.14*r*r);
		
	}

	

}
