package VersionG;
import java.util.Scanner;

public class Manager extends Employee{
	
	private String Department;
	int ProductNo1, ProductNo2, ProductNo3;

	public Manager(String Department, int ProductNo1, int ProductNo2, int ProductNo3) {
		// TODO Auto-generated constructor stub
		super();
		this.Department = Department;
		this.ProductNo1 = ProductNo1;
		this.ProductNo2 = ProductNo2;
		this.ProductNo3 = ProductNo3;
	}

	public void Read() {
		
		Scanner Sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter Department: ");
			this.Department = Sc.next();
			
			System.out.print("Enter Product Number 1: ");
			this.ProductNo1 = Sc.nextInt();
			
			System.out.print("Enter Product Number 2: ");
			this.ProductNo2 = Sc.nextInt();
		}
		catch(Exception ex1) {
			System.out.println(ex1);
		}
	}
		
		public void Print(){
			super.Print();
			
			System.out.println("Department : "+this.Department);
			System.out.println("ProductNo1 : "+this.ProductNo1);
			System.out.println("ProductNo2 : "+this.ProductNo2);
			System.out.println("ProductNo3 : "+this.ProductNo3);
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp = new Employee();
		
		emp.Read();
		emp.Print();
		
	

	}


}


