package Functions;
import java.util.*;
public class sum_func {
	
	public static void sum(int a, int b){ // if we do with void then use print(sum)
		
		int sum= a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();       //we use void then call method is sum(a,b)
		sum(a,b);
		

	}

}
