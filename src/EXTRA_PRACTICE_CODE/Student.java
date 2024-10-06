package EXTRA_PRACTICE_CODE;


import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("NAME   :  MARKS");
		Student_use s1 = new Student_use("Himanshu",85,90);
		Student_use s2 = new Student_use("eshika",75,80);
		s1.print();
		s2.print();
		
		s1.comparemarks(s2);

	}
	
	
}
