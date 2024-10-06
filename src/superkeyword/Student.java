package superkeyword;

public class Student {
	
	String name;
	String color="white";
	int id;
	
	
	
	public Student(String name, int id) {
		//super();
		this.name = name;
		this.id = id;
	}
	
	
	public void display() {
		System.out.println(name+" "+id);
	}
	
	

}
