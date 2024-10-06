package bankaccount1;

public abstract class Account {
	
	double balance;
	
	public Account(double balance) {
		this.balance=balance;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	public double getBalance() {
        return balance;
    }

}
