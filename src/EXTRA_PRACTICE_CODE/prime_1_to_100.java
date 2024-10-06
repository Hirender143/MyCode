package EXTRA_PRACTICE_CODE;

import java.util.*;
public class  prime_1_to_100 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ENTER NUM: ");
//		int num = sc.nextInt();
		
	 for(int num =1; num<=100; num++) {
		 int divcount=0;
		 for(int i=1; i<=100; i++) {
			 if(num%i==0) {
				 divcount++;
			 }
			 
		 }
		 if(divcount==2) {
			 System.out.print(num+" ");
		   }
		 }
	 
	 }

}
