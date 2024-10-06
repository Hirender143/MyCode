package RECURSION_;

public class Print_1_to_n {
	
	
	public static void nat(int n) {
		if(n>0) {
			
			//nat(n-1);
			System.out.print(n+" ");
			nat(n-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=50;
		nat(n);

	}

}
