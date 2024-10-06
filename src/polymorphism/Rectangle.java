package polymorphism;

public class Rectangle implements Shape {
	
	private double l;
	private double b;
	
	

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}



	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return l*b;
		
	}

}
