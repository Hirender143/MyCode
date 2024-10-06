package all_basic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask if the user wants the birthday wish
        System.out.println("Is it necessary to birthday wish you? Press 1 for Yes and 2 for No:");
        int response = sc.nextInt();

        if (response == 1) {
            // If the response is yes, ask how many times to say the wish
            System.out.println("How many times do you want me to say your birthday wish?");
            int num = sc.nextInt();

            // Confirm the number of times to say the wish
            System.out.println("Are you sure you want me to say it " + num + " times? Press 1 for Yes and 2 for No:");
            int confirm = sc.nextInt();

            if (confirm == 1) {
                // Loop to print the birthday wish the specified number of times
                for (int i = 0; i < num; i++) {
                    System.out.println("HAPPY BIRTHDAY MY LOVE WAHEGURU JI BLESS YOU WITH LOTS OF HAPPINESS AND SUCCESS");
                }
            } else {
                System.out.println("Okay, let's skip the birthday wishes.");
            }
        } else if (response == 2) {
            // If the response is no, provide additional options
            System.out.println("If I don't do wish to you, then what will you do?");
            System.out.println("1. Kill me");
            System.out.println("2. Not talk to me");
            System.out.println("3. Break up");
            int consequence = sc.nextInt();

            switch (consequence) {
                case 1:
                    System.out.println("police la jaugii Jail ch");
                    break;
                case 2:
                    System.out.println("Jaan !! Tum maan jayogi (bcz I love you)!!");
                    break;
                case 3:
                    System.out.println("charkha chalda rha, kda tand na toota");
                    System.out.println("Jindagi chalde rahe, Saada pyaar na tuute Happy Birthday Love !!!");
                    break;
                default:
                    System.out.println("Invalid input. Please choose 1, 2, or 3.");
                    break;
            }
        } else {
            // If the response is not 1 or 2, print an invalid input message
            System.out.println("PGL AW BAWLI JO PUCHA BO HI BTA BSS FALTU CHONCHLA NAA KRR");
        }

        // Final message after all operations
        System.out.println("GUSSA NA KRYA KRR YARRA (YOU ARE PRECIOUS TO ME)");

        // Close the scanner
        sc.close();
    }
}
