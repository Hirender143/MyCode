package inheritance1;

public class Rectangle {
	double length;
	double breadth;
	
	
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea() {
		return length*breadth;
	}
	
	

}
