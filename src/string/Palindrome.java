package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		String str1="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			str1+=str.charAt(i);
			//System.out.print(str.charAt(i));
		}
		
		if(str1.equalsIgnoreCase(str)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
