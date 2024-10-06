package RECURSION_;

import java.util.Scanner;

public class Find_last_index {
	
	public static int findnum(int []arr,int index, int target,int size) {
		if(index>=arr.length) {            //BASE CASE
			return -1;
		}
		
		if(target==arr[index]) {
			//System.out.println(count+1);
			return findnum(arr,index+1,target,size-1);
		}
		
		return findnum(arr,index+1,target,size-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []arr= {5,9,11,5,7,6,9,5,11};
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int[]arr= new int[size];
		
		for(int i=1;i<size;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		int num=findnum(arr,0,5,9);
		
		System.out.println(num);

	}

}
