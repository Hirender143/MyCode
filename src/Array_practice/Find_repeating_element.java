package Array_practice;
import java.util.*;
public class Find_repeating_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of arr: ");
		int size = sc.nextInt();
		
		int arr[]= new int [size];
		System.out.println("Enter element of arr: ");
		for(int i=0;i<size;i++) {
			System.out.println("Element"+(i+1)+": ");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("The repeating number is: ");
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
