package abstract_and_interface1;

public class Rectangle extends Shape {
	double l;
	double w;
	
	public Rectangle(double l, double w) {
		this.l=l;
		this.w=w;
	}
	
	public double CalculateArea() {
		return l*w;
	}



	

}
