package Array_practice;
import java.util.*;
public class Add_matrix {

	public static void main(String[] args) {
		
	
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter i-->> ");
		 int m = sc.nextInt();
		 System.out.print("Enter j-->> ");
		 int n = sc.nextInt();
		 
		 
		 System.out.print("1st matrices: ");
		 int arr[][]= new int[m][n];
		 
		    for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++)
			 {
				 arr[i][j]= sc.nextInt();
			 }
			 
		 }
		    System.out.println("2nd matrices: ");
		    for(int a=0;a<m;a++) {
				 for(int b=0;b<n;b++)
				 {
					 arr[a][b]= sc.nextInt();
				 }
				 
			 }
		    
		    System.out.println("First matrix: ");
		    for(int i=0;i<m;i++) {
				 for(int j=0;j<n;j++)
				 {
					 System.out.print(arr[i][j]+"  ");
				 }
				 System.out.println();
			 }
		    
		    System.out.println("Second matrix: ");
		    for(int a=0;a<m;a++) {
				 for(int b=0;b<n;b++)
				 {
					 System.out.print(arr[a][b]+"  ");
				 }
				 System.out.println();
			 }
		    

		 

	}

}
