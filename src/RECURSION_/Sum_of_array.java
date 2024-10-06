package RECURSION_;



public class Sum_of_array
{
	public static int sumarr(int[]arr,int index){
		if(index>=arr.length){
			return 0;
		}
		return arr[index]+sumarr(arr,index+1);
	}
	public static void main(String[] args) {
		int []arr={1,7,9};

		int sum = sumarr(arr,0);

		System.out.print("sum of array: "+sum);




	}
}

