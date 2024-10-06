package RECURSION_;

public class Number_search_array {
	
	
	public static boolean findnum(int[]arr,int target, int index) {
		
		if(index>=arr.length) {
			return false;
		}
		if(arr[index]==target) {
			return true;
		}
		
		return findnum(arr,target,index+1);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {1,6,7,9,11,18,34};
		
		boolean found = findnum(arr,35,0);
		
		if(found) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

	}

}
