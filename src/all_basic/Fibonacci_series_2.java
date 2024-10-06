package all_basic;

import java.util.*;
public class Fibonacci_series_2 {

	public static void main(String[] args) {
		
		int a=0, b= 1, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Count: ");
		int num = sc.nextInt();
		
		
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=num;i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
