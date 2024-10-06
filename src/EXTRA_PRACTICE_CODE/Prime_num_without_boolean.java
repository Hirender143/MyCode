package EXTRA_PRACTICE_CODE;

import java.util.*;
public class Prime_num_without_boolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUM: ");
		int num = sc.nextInt();
		
		int divcount=0;
		
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				divcount++;
			}
			
		}
		if(divcount==2) {
			System.out.println("Num is prime");
		}
		else {
			System.out.println("Num is not prime");
		}

	}

}
