package all_basic;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int sum = 1;
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number : ");
		 int num = sc.nextInt();
		 
		 
		 for(int i= 1; i<=num; i++) {
			 sum= sum*i;
		 }
		 System.out.println("THE FACTORIAL OF "+num+" is: "+sum);
		 

	}

}
