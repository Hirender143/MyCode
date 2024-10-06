package classes_and_object;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Product p;

        float grossAmt = 0, netAmt = 0;

        float cashDiscAmt = 0;

        char cashDisc = 'N'; // initialize cashDisc to 'N'

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            p = new Product();

            p.setPrice(sc.nextFloat());

            p.setQty(sc.nextFloat());

            cashDisc = sc.next().charAt(0);

            if (p.getQty() < 16) {

                grossAmt += p.getPrice() * p.getQty();

                grossAmt = (float) (grossAmt - (grossAmt * 0.20));
            }
        }

        if (cashDisc == 'Y' || cashDisc == 'y') {

            cashDiscAmt = (float) (grossAmt * 0.05);

            grossAmt = grossAmt - cashDiscAmt;

            netAmt += grossAmt;
        } else {

            netAmt += grossAmt;
        }

        System.out.println(netAmt);
    }
}
