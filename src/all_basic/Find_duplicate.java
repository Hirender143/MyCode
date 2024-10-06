package all_basic;

import java.util.*;
public class Find_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
	 for (int i = 0; i < size; i++) {
		arr[i] = sc.nextInt();
	}
	 LinkedHashSet <Integer> set = new LinkedHashSet<Integer>(); //new ;linked hash(syntax hashset) set
       
	 for (int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
	 System.out.println(set);
	}

}
