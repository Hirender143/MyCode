package Array_practice;

import java.util.*;
public class Repeating_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER RANGE: ");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter Element: ");
		for(int i=0;i<size;i++) {
			System.out.println("Element"+(i+1)+": ");
			arr[i]= sc.nextInt();
			
		}
		System.out.println("Repeating element is: ");
		for(int i =0; i<size;i++) {
			for(int j=0; j<i;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" "+arr[j]);
					
				}
			}
		}

	}

}
