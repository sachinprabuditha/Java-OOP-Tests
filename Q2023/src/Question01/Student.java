package Question01;

import java.util.Scanner;

public class Student {
	private String StudentId;
	private String name;
	private String address;
	private String contactNo;
	
	public Student(String studentId, String name, String address, String contactNo) {
		super();
		StudentId = studentId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void Read() {
		System.out.println("Enter Student Id: ");
		StudentId = sc.next();
		
		System.out.println("Enter Name: ");
		name = sc.next();
		
		System.out.println("Enter Address: ");
		address = sc.next();
		
		System.out.println("Contact Number: ");
		contactNo = sc.next();
		
	}
	
	public void Print() {
		System.out.println("Student Information: ");
		System.out.println("Student ID is : " + StudentId);
		System.out.println("Student Name is : " + name);
		System.out.println("Student Address : " + address);
		System.out.println("Student Telephone is : " + contactNo);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
