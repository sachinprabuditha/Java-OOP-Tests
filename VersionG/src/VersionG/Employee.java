package VersionG;
import java.util.Scanner;

public class Employee {
    protected String Empid;
    protected String name;
    protected String address;
    
    public Employee() {
    	
    }
    
	public Employee(String Empid, String name, String address) {
		// TODO Auto-generated constructor stub
		this.Empid = Empid;
		this.name = name;
		this.address = address;
	}
	
	public void Read(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Emp Id: ");
		this.Empid = sc.next();
		
		System.out.print("Enter Name: ");
		this.name = sc.next();
		
		System.out.print("Enter Address: ");
		this.address = sc.next();
		
	}
	
	public void Print() {
		System.out.println("Employee ID: " + Empid);
	}

}
