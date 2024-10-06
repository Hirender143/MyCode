package inheritance;

class Teacher extends Person{
	String sub_expert;
	double salary;
	
	public Teacher(int age,String name,String sub_expert,double salary) {
		super(age, name);
		this.sub_expert= sub_expert;
		this.salary=salary;
	}
	
	public void print_teacher() {
		super.print_person();
		System.out.println("subject expert of: "+sub_expert);
		System.out.println("salary of teacher: "+salary);
	}
}

