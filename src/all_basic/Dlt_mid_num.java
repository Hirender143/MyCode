package all_basic;

import java.util.*;
public class Dlt_mid_num {

	public static void main(String[] args) {
		int mid=0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		sc.nextLine();
		
		for (int i = 0; i < num; i++) {
			
		int ele = sc.nextInt();
		alist.add(ele);
		}
		System.out.println(alist);
		int start =1;
		int end = num-1;
		
	
			
			mid = start + end/2;
			
		
		System.out.println(mid);
	}
	
	

}
