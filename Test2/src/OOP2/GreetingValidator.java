package OOP2;

import java.util.Scanner;

public class GreetingValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		
		System.out.println("Enter Your age: ");
	    int age = sc.nextInt();
	    
	    if (age < 0 || age >120) {
	    	throw new InvalidInputException();
	    }
	    System.out.println("Hello, " + name + "!You are "+age+"years old.");
	    
	} catch(InvalidInputException e) {
		System.out.println(e.getMessage());
	}catch(Exception e) {
		System.out.println("Invalid input. Please enter a valid name and age.");
	}

	}

}
