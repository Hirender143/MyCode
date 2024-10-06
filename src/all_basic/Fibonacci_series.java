package all_basic;
import java.util.*;
public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0; int b=1;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("count: ");
	        int num=sc.nextInt();
	       

	        System.out.print(a+" "+b+" ");
	        for(int i=2; i<num;i++){
	            int c=a+b;
	            System.out.print(c+" ");
	                a=b;
	                b=c;

	        }

	}

}
