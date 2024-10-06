package overloading;

//Design a Calculator class that provides overloaded methods for addition. Implement methods 
//for adding two integers, two doubles, and an integer and a double

public class Calculator {

	public int add(int a, int b) {

		return a + b;

	}

	public double add(double a, double b) {

		return a + b;

	}
	
	public double add(int a, double b) {

		return a + b;

	}

}
