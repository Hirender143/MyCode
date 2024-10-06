package Array_practice;

import java.util.*;
public class Smallest_num_one {

	public static void main(String[] args) {
		int small;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter range: ");
		int size= sc.nextInt();
		
		int arr[] = new int [size];
		
		System.out.println("Enter element: ");
		for(int i=0; i<size; i++) {
			System.out.print("Element"+(i+1)+": ");
			arr[i]= sc.nextInt();
		}
		 
		small = arr[0];
		for(int i=1; i<size; i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(small+" is a smallest number Buddy.");
		

	}

}
