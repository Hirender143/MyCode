package Pattern;

public class Half_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=n;i>=1;i++) {
			for(int j=n;j<=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
