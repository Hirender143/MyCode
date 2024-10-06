package RECURSION_;

public class Count_zeros {
	
	public static int couzero(int n) {
		if(n==0) {
			return 1;
			
		}
		if(n<10) {
			return 0;
		}
		int l = n%10;
		int count = (l == 0) ? 1 : 0;
			return 1+couzero(n/10);
		
	}

public static void main(String[] args) {
		int n=700;
		
		System.out.println(couzero(n));

	}

}
