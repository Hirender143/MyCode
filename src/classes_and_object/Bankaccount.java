package classes_and_object;

public class Bankaccount {
	int acc_num;
	String acc_holder_name;
	double balance;
	
	
	public Bankaccount(int acc_num,String acc_holder_name,double balance) {
		this.acc_num= acc_num;
		this.acc_holder_name=acc_holder_name;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		if(amount> 0) {
			balance+=amount;
			System.out.println(amount+" Rupees Deposit Successful. Now, New Balance: "+balance);
		}
		else {
			System.out.println(" Not successful. Now,may be invalid amount or Insufficent Balance");
		}
	}
	
	public void withdraw(double amount) {
		if(amount> 0 && amount <=balance) {
			balance-=amount;
			System.out.println(amount+" Rupees withdraw Successful. Now, New Balance: "+balance);
		}
		else {
			System.out.println(" Not successful. Now,may be invalid amount or Insufficent Balance");
		}
	}
	
	public void print() {
        System.out.println("Account Number: " + acc_num);
        System.out.println("Account Holder Name: " + acc_holder_name);
        System.out.println("Balance: " + balance);
    }
	
	

}
