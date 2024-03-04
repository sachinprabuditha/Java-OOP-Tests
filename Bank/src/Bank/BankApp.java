package Bank;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ac1 = new BankAccount(1234, "Sam" , 10000.0);
		BankAccount ac2 = new BankAccount(5678, "John" , 20000.0);
		
		ac2.setBalance(500.0);
        ac2.deposite(200.0);
        ac2.withdraw(50.0);
		
		System.out.println("Account 1: ");
		ac1.display();
		
		System.out.println("\nAccount 2: ");
		ac2.display();

	}

}
