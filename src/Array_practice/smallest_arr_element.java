package Array_practice;
import java.util.*;
public class smallest_arr_element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++){
			System.out.println("Element"+(i+1)+": ");
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		for(int i=1;i<size;i++){
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("The smallest number is: "+small);
		
	}

}
