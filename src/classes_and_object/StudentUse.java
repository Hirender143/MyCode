package classes_and_object;      

import java.util.*;
public class StudentUse {

	public static void main(String[] args) {          // main class ma hum input leta hai
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("HIMANSHU",1519);    // default constructor = Student s1= new student() bracket empty means ki by deafult constructor mila
		                                                                  //constructor also here
		Student s2 = new Student("ESHIKA",1515);
		
		
		
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s2.getRoll_num());
		
		s1.print();
		s2.print();

	}

}
