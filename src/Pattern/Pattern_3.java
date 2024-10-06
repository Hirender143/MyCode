package Pattern;

import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int row = sc.nextInt();
		
		for (int i = 0; i <= row; i++) {
			//for (int j = 1; j <=(row+1)-i; j++) { // if we start row from 1
			for (int j = 0; j <=row-i; j++) { // if we start i(row from 0)
				System.out.print("*  ");
			}
			System.out.println();

	}

	}
}
