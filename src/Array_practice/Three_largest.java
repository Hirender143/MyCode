package Array_practice;

import java.util.*;
public class Three_largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		
		System.out.println("Enter element of array: ");
		for(int i=0; i<size;i++) {
			System.out.println("Element"+(i+1)+": ");
			arr[i]= sc.nextInt();
			
		}

	}

}
