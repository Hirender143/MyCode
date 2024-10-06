package RECURSION_;

public class Arr_recurs {
	
	public static int recur(int input[], int SI) {
		if(SI==input.length) {
			return 1;
		}
		return input[SI]*recur(input,SI+1);
		
	}

	public static void main(String[] args) {
		
		int input[]= {7,6,2};
		int SI = 0;
		
		System.out.println(recur(input,SI));
		

	}

}
