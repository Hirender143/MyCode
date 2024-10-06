package EXTRA_PRACTICE_CODE;

import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
