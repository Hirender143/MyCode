package Practice_again;

import java.util.*;
public class Arr_max {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size of arr: ");
	int size = sc.nextInt();
	
	int arr [] = new int [size];
	System.out.println("Enter elements of array: ");
	
	for(int i= 0; i<size;i++) {
		System.out.print("Element"+(i+1)+": ");
		arr[i]= sc.nextInt();
		
		
	}
	int max =0;
	for(int i=0; i<size; i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
		
	}
	
	System.out.println("Largest element: "+max);
	}

}
