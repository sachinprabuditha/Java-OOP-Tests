package LabSheetGeneric;

public class GenericPrinter {
	public static <T> void print(String message, T value) {
		System.out.println(message + value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 24;
		double salary = 500.50;
		String name = "John";
		
		print("Age is: ", age);
		print("Salary is: ", salary);
		System.out.println("Name: " + name);

	}

}
