package overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new Calculator();
		
		System.out.println("BOTH INT : "+c1.add(2,2));
		System.out.println("BOTH DOUBLE: "+c1.add(2.5,3.7));
		System.out.println("1 INT 1 DOUBLE: "+c1.add(5, 5.6));
		

	}

}
