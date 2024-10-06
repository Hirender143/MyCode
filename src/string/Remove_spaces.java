package string;

import java.util.Scanner;

public class Remove_spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		String result=str.trim();
		System.out.println(result);

	}

}
