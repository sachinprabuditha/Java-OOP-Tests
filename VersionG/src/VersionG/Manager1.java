package VersionG;

import java.util.Scanner;

public class Manager1 extends Employee1{
	
	private String Department;
	int pno1, pno2, pno3;

	public Manager1() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Manager1(String department, int pno1, int pno2, int pno3) {
		super();
		Department = department;
		this.pno1 = pno1;
		this.pno2 = pno2;
		this.pno3 = pno3;
	}
	
	public void Read1() {
		super.Read1();
		Scanner sc = new Scanner(System.in);
	try {
		
		System.out.println("Enetr Product No1: ");
		int pno1 = sc.nextInt();
		
		System.out.println("Enter Product No2: ");
		int pno2 = sc.nextInt();
		
		System.out.println("Enter Product No3: ");
		int pno3 = sc.nextInt();
		
		System.out.println("Department: ");
		String department = sc.next();
		
	}
	catch(Exception ex1){
		System.out.println("ex1");
		
	}
	}
	
	public void Print1() {
		super.Print1();
		System.out.println("Product number 1: " + this.pno1);
		System.out.println("Product number 2: " + this.pno2);
		System.out.println("Product number 3: " + this.pno3);
		System.out.println("Department: " + this.Department);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1();
		Manager1 mg = new Manager1();
		
		mg.Read1();
		mg.Print1();
		
		
		emp.Read1();
		emp.Print1();
		

	}

}
