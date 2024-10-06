package all_basic;


import java.util.*;
public class Add_num_in_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0;  i< arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		for (int  i= 0; i < arr.length; i++) {
			arr[i]+=1;
		}
		for (int  i= 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		
		
		

	}
	}}
