package Pattern;
import java.util.*;
public class Pattern_practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int row = sc.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}

}
