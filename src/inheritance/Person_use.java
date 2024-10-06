package inheritance;

public class Person_use {

	public static void main(String[] args) {
		Student s1 = new Student(23,"Rita",1502,"B.TECH");
		
		Teacher t1 = new Teacher(45,"SEEMA HAIDER","physics",59000);
		
          System.out.println("student DETAILS: ");
          //s1.print_person();
          s1.print_student();
          
          System.out.println("TEACHER DETAILS: ");
          //t1.print_person();
          t1.print_teacher();
          System.out.println("TEACHER DETAILS: ");
    
	}

}
