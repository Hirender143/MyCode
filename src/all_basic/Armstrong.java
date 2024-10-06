package all_basic;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		int r;
		int cubesum =0;
		int temp ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int n = sc.nextInt();
		
		temp = n;
		while(n>0) {
			r =n%10;
			cubesum += Math.pow(r, 3);
		    n/=10;
		}
		if(cubesum==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}
