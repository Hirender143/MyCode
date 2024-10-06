package EXTRA_PRACTICE_CODE;

import java.util.*;

public class Linear_search {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER SIZE: ");
		int size =sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("Element"+(i+1)+": ");
			arr[i]=sc.nextInt();			
		}
		
		System.out.println("Which number u find: ");
		int num = sc.nextInt();
		
		
		
		for(int i=0; i<size;i++) {
			
			if(arr[i]==num) {
				System.out.println(i+1);
			}
			
			
		}

	}

}
