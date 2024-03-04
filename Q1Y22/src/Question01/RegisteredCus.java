package Question01;

import java.util.Scanner;

public class RegisteredCus extends Customer {

	private double rewardPoints;
	private double netAmount;

	public RegisteredCus(int id, String name) {
		super(id, name);
		this.rewardPoints = rewardPoints;
		this.netAmount = netAmount;
	}

	@Override
	public double calculateBill() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bill Amount: ");
		double bill = sc.nextDouble();
		
		if(bill > 950) {
			rewardPoints = (15.0/100)* bill;
		}
		
		double discount = bill * (7.0/100);
		
		netAmount = bill - discount;
		
		return 0;
	}
	
	public void display() {
		super.display();
		calculateBill();
		
		System.out.println("Reward Points: " + rewardPoints);
		System.out.println("Net Amount: " + netAmount);
	}

}
