package string;

import java.util.Iterator;
import java.util.Scanner;

public class Count_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		int vowelCount =0;
		
		str=str.toLowerCase();
		
		for(int j=0;j<=str.length()-1;j++) {
			char ch = str.charAt(j);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
				
			}
			
		}
		System.out.println(vowelCount);

	}

}
