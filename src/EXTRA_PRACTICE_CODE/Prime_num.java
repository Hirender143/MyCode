package EXTRA_PRACTICE_CODE;

import java.util.*;
public class Prime_num {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUM: ");
		int num = sc.nextInt();
		//int num =13;
		boolean prime = true;
		
		
		for(int i=2; i<num;i++) {
			if(num%i==0){
				prime= false;
				break;
			}
		}
		System.out.println(prime);
		
	}

}
