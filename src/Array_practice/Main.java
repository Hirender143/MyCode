package Array_practice;

public class Main {
	public static int addunique(int arr[]) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] != arr[j]) {
					count += i;
				}
				
				System.out.println(count);

			}
			
		}
		return -1; // if not any one unique element
	    

	}

	public static void main(String[] args) {
		//System.out.println("Hello World");

		int[] arr = { 1,1,4,2,3 };

		int sum = addunique(arr);
		System.out.print(sum);

	}
}
