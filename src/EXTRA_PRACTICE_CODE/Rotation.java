package EXTRA_PRACTICE_CODE;

import java.util.*;
public class Rotation {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter S1: ");
		String s1 = sc.nextLine();
		System.out.println("Enter S2: ");
		String s2 = sc.nextLine();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not rotW");
			System.exit(0);
		}
		
		String s3 = s1+s1;
		if(s3.indexOf(s2)!=-1) {
			System.out.println("Rotating string");
		}
		else {
			System.out.println("not Rotating");
		}
	}
	
	
	
}
