package bankaccount1;

public class Simpleaccount extends Account {
	
	public Simpleaccount( double balance) {
		super(balance);
	}
	
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("Insufficent BALANCE");
		}
	}

}
