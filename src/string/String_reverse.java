package string;

import java.util.*;

public class String_reverse {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		System.out.println(str);
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
		
		
	}

	

}
