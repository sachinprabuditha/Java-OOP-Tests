package VersionG;

import java.util.Scanner;

public class Employee1 {
	protected String Empid;
	protected String name;
	protected String address;

	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public Employee1(String empid, String name, String address) {
		super();
		Empid = empid;
		this.name = name;
		this.address = address;
	}
	
	public void Read1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmpID: ");
		String Empid = sc.next();
		
		System.out.println("Enetr NAme: ");
		String name = sc.next();
		
		System.out.println("Enter address: ");
		String address = sc.next();
		
	}
	
	public void Print1() {
		System.out.println("EmpID: " + this.Empid);
		System.out.println("Name: " + this.name);
		System.out.println("Addres: " + this.address);
	}

	
	

}
