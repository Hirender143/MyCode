package RECURSION_;

public class see_FIRST_INDEX {


	public static int findindex(int []arr,int target,int index) {
		if(index>=arr.length) {
			return -1;
		}

		if(arr[index]==target) {
			return index;
		}
		return findindex(arr, target, index+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {7,8,9,12,16,9};

		int num=findindex(arr,11,0);
		System.out.println(num);

	}

}
