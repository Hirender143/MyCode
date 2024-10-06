package RECURSION_;


public class Power {
	
	public static int powd(int x,int n) {
		if(x==1 || n==1) {
			return 1;
		}
		
		return x*powd(x,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =5;
		int n=5;
		
		int ans = powd(x,n);
		System.out.println(ans);
		

	}

}
