package Array_practice;
import java.util.*;
public class Twod_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of row(i): ");
		int r= sc.nextInt();
		System.out.print("Enter size of column(j): ");
		int j= sc.nextInt();
		
		System.out.println("Enter element of array: ");
		
		int arr[][]= new int[r][j];
		
		for(int i=0;i<r;i++) {
			for(int p=0;p<j;p++) 
			{
//				System.out.println("Element"+(i+1)+": ");
				arr[i][p] = sc.nextInt();
			}
		}
		
//		System.out.println("Data you entered: ");
//		for(int i=0;i<r;i++) {
//			for(int p=0;p<j;p++) {
//				System.out.print(arr[i][p]+" ");
//			}
//			System.out.println();
//		}
		

	}

}
