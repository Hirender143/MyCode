package polymorphism;

public class Triangle implements Shape {
	
	private double b;
	private double h;
	
	
	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}


	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*b*h;
	}
	
	

}
