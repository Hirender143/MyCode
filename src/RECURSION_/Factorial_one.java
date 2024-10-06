package RECURSION_;

import java.util.*;

public class Factorial_one {
	
	public static int fact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		
		int ans = fact(n);
		System.out.println("FACTORIAL OF "+n+" is: "+ans);
		

	}

}
