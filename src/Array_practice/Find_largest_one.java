package Array_practice;

import java.util.*;
public class Find_largest_one {

	public static void main(String[] args) {
		//int max =arr[1];
		
		int arr[]= {-7,-5,-9,-8};
		int max =arr[1];
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size");
//		int size = sc.nextInt();
//		
//		int arr[] = new int[size];
//		
//		System.out.println("Enter elements of arr: ");
//		
//		for(int i=0; i<size; i++) {
//			System.out.println("Element"+(i+1)+": ");
//			
//			arr[i] = sc.nextInt();
//		}
         for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("largest number : "+max);
		

	}

}
