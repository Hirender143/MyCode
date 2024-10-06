package RECURSION_;
import java.util.Scanner;

public class Natural_num_sum {
	
	public static int natural(int n) {
		
		if(n==1) {
			return 1;
		}
		return n+natural(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER N: ");
		int n = sc.nextInt();
		
		int ans = natural(n);
		System.out.println(ans);
		
		
		

	}

}
