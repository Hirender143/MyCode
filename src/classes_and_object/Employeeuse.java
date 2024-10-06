package classes_and_object;

public class Employeeuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee E1 = new Employee("KARAN SANGWAN");
//		Employee E2 = new Employee("RAMAN JATT");
		
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		
		E1.Name="KARAN SANGWAN";
		E2.Name="JATTWADD SINGH";
		
		
		E1.setSalary(25000);
		E2.setSalary(29500);

//		E1.print();
//		E2.print();
		System.out.println(E1.Name+" : "+E1.getSalary());
		
	}

}
