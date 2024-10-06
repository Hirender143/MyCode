package Array_practice;

import java.util.Arrays;

public class Secondlargest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,9,8,12,15,17};
		
		Arrays.sort(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
//		System.out.println(arr[2]);

	}

}
