package bankaccount1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Simpleaccount(1000);
        a1.deposit(500);
        a1.withdraw(300);

        System.out.println("Current balance: " + a1.getBalance());

	}

}
