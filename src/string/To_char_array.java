package string;

import java.util.Scanner;

public class To_char_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		char ch[]= str.toCharArray();
		
		for(char val : ch) {
			System.out.print(val+" ");
		}
		

	}

}
