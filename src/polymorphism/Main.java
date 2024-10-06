package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int r=7;
		
		Circle c1 = new Circle(7);
		Rectangle r1 = new Rectangle(4,5);
		Triangle t1 = new Triangle(7,4);
		
		System.out.println(c1.calculateArea());
		System.out.println(r1.calculateArea());
		System.out.println(t1.calculateArea());

	}

}
