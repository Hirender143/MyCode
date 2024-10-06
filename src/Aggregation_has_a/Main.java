package Aggregation_has_a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1= new Address("Batala","Mohali",140201);
		
		Employee e1 = new Employee("KARAN SAINI",123, a1);
		
		
		e1.print();

	}

}
