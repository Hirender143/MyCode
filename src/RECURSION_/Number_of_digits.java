package RECURSION_;

import java.util.Scanner;

public class Number_of_digits {
	
	public static int count(int num) {
		if(num<10 ||num<=0) {
			return 1;
		}
		return 1+count(num/10);
				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER NUM: ");
		int num = sc.nextInt();
		
		System.out.println(count(num));

	}

}
