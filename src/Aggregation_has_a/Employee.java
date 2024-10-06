package Aggregation_has_a;

public class Employee {
	String name;
	int id;
	Address address;
	
	public Employee(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public void print() {
		System.out.println(name+" "+id);
		System.out.println(address.city+" "+address.district+" "+address.pincode);
	}
	
	
	

}
