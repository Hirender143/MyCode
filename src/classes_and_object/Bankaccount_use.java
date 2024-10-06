package classes_and_object;

import java.util.*;
public class Bankaccount_use {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bankaccount b1 = new Bankaccount(1205,"KARAN",2500.0);
		
		
		//System.out.println(b1.acc_holder_name);
		b1.print();
		
		b1.deposit(500.0);
		b1.withdraw(1225.25);

	}

}
