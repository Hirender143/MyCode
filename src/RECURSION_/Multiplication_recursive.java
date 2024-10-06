package RECURSION_;

public class Multiplication_recursive {
	
	public static int multi(int m, int n) {
		if(n==0) {
			return 0;
		}
		
		//int simpcal =m*multi(m,n-1);
		//return simpcal+m;
		
		return  m+multi(m,n-1);
	}

	public static void main(String[] args) {
		int m =4;
		int n=5;
		
		System.out.println(multi(m,n));

	}

}
