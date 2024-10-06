package all_basic;

import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		int r; int sum =0;; int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n = sc.nextInt();
		
		temp =n;
		
		while(n!=0) {
			r= n%10;
			sum= (sum*10)+r;
			n/=10;
		}
		if(temp==sum) {
			System.out.println("Num is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		//System.out.println(sum);
		
	}

}
