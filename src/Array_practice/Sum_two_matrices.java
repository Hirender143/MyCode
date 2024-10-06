package Array_practice;
import java.util.*;
public class Sum_two_matrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size_1: ");
		int size_1 = sc.nextInt();
		System.out.print("Enter size_2: ");
		int size_2 = sc.nextInt();
		
		int arr[] [] = new int[size_1][size_2];
		int sum[][] = new int[size_1][size_2];
		System.out.println("1st matrix is: ");
		
		
		for(int i=0;i<size_1;i++) 
		{
			
			for(int j=0;j<size_2;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		System.out.println("2nd matrix is: ");
		for(int i=0;i<size_1;i++) 
		{
			
			for(int j=0;j<size_2;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		System.out.println("2nd matrix is: ");
		for(int i=0;i<size_1;i++) 
		{
			
			for(int j=0;j<size_2;j++) {
				arr[i][j]= arr[i][j]+arr[i][j];
			}
		}
		
		// Display Result
		System.out.println("The result is: ");
		for(int i=0;i<size_1;i++) 
		{
			
			for(int j=0;j<size_2;j++) {
				System.out.println(arr[i][j]+" ");
			}
			
		}
		
		

	}

}
