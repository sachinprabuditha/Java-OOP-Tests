package Bank;

public class BankAccount {
	
	private int acNo;
	private String hName;
	private double balance;
	
	public BankAccount(){
		acNo = 0;
		hName = " ";
		balance = 0.0;
		
	}

	public BankAccount(int acNo, String hName, double balance) {
		// TODO Auto-generated constructor stub
		this.acNo = acNo;
		this.hName = hName;
		this.balance = balance;
		
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double newbalance) {
		this.balance = newbalance;
	}
	
	public void deposite(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			balance = balance - amount;
		}
		else {
			System.out.println("Insufficient Balance.");
		}
	}
	
	public void display() {
		System.out.println("Account Number: " + acNo);
		System.out.println("Account Holder Name: " + hName);
		System.out.println("Balance: " + balance);
	}

}
