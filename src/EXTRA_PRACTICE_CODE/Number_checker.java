package EXTRA_PRACTICE_CODE;

import java.util.Scanner;

public class Number_checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n % 2 == 1 || (n % 2 == 0 && n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        
        scanner.close();
    }
}

