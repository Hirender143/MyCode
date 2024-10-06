package class__;

class Outer {
	// Private instance variable of the Outer class
	private int outerVar = 10;

	// Member Inner class definition
	class Inner {
		// Method in the Inner class to display the outerVar
		void display() {
			// Accessing the private member of the Outer class
			System.out.println("Outer variable: " + outerVar);
		}
	}
}

public class Inner_and_nested_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating an instance of the Outer class
		Outer outer = new Outer();

		// Creating an instance of the Inner class
		// Note: We need an instance of Outer class to create an instance of Inner class
		Outer.Inner inner = outer.new Inner();

		// Calling the display method of the Inner class
		inner.display();
		

	}

}
