package Array_practice;
import java.util.*;
public class Find_largest {

	public static void main(String[] args) {
		
		int max =0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		
		int []arr= new int[size];
		
		System.out.println("Enter element of array: ");
		
		for(int i=0; i<size;i++) {
			System.out.print("Element"+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			if(arr[i]>max) {      // if arr[i] is greater than max, than max is equal to arr[i]
				max=arr[i];          
			}
			
		
		}
		System.out.print("Largest num is: "+max);

	}

}
