package abstract_and_interface1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape c1 = new Circle(5);
		Shape r1 = new Rectangle(5.7,2.4);
		
		System.out.println(c1.CalculateArea());
		System.out.println(r1.CalculateArea());

	}

}
