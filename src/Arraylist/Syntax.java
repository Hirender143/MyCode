package Arraylist;

import java.util.ArrayList;

public class Syntax {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);

		System.out.println(num);

		num.remove(1);
		System.out.println(num);

		System.out.println(num.get(1));
		System.out.println(num.size());

	}
}
