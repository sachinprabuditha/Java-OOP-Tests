package Question01;

import java.util.Scanner;

public class RegisteredCus extends Customer{
	Scanner sc = new Scanner(System.in);
	
	private double rewardPoints;
	private double netAmount;

	public RegisteredCus(int id, String name) {
		super(id, name);
		this.rewardPoints = 0.0;
		this.netAmount = 0.0;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		System.out.print("Enter Bill Amount: ");
		double billAmount = sc.nextDouble();
		
		if(billAmount > 950.0) {
			rewardPoints = billAmount * (15/100);
		}
		
		double discount = (7/100)* billAmount;
		netAmount = billAmount - discount;
		
		return netAmount;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		calculateBill();
		
		System.out.println("Customer Reward Points: " + this.rewardPoints);
		System.out.println("Customer Net Amount to pay: " + this.netAmount);
		System.out.println();
		
	}
	
	
	
	

	

}
