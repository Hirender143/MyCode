package Array_practice;

import java.util.*;
public class Add_matrix_one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size: ");
		int r = sc.nextInt();
		System.out.print("Enter column size: ");
		int c = sc.nextInt();
		
		int arr [][] = new int [r][c];
		
		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=arr[i][j]+arr[i][j];
			}
		}
		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println(arr[i][j]+" ");
			}
		}

	}

}
