package inheritance;

class Student extends Person{
	int stu_id;
	String course;
	
	public Student(int age,String name, int stu_id,String course) {
		super(age, name);
		this.stu_id=stu_id;
		this.course=course;
		
	}
	
	public void print_student() {
		super.print_person();
		System.out.println("Stu_id is: "+stu_id);
		System.out.println("Student course: "+course);
	}
}
