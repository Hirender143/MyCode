package EXTRA_PRACTICE_CODE;

import java.util.*;
public class Vehicleuse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MODEL   : MILAGE");
		vehicle v1 = new vehicle();
		v1.model=1998;
		v1.setmilage(25);
		
		System.out.println(v1.model);
		System.out.println(v1.getmilage());
		
		
		//v1.print();
		v1.setmilage(90);
		System.out.println("The new milage is:"+v1.getmilage());

	}

}
