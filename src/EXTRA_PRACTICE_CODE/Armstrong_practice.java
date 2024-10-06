package EXTRA_PRACTICE_CODE;
import java.util.*;

public class Armstrong_practice {
	
//	public static void Armstro(int num) {
//		while(num!=0) {
//			num=num/10;
//			cubesum=
//		}
//		
//	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int cubesum =0; int digit;
		int num = 1253;
		int temp=num;
		
		while(num!=0) {
			
			digit = num%10;
			cubesum+=Math.pow(digit, 3);
			num/=10;
			
		}
		if(temp==cubesum) {
			System.out.println("ARMSTRONG");
		}
		else{
			System.out.println("NOT ARMSTRONG");
			
		}

	}

}
