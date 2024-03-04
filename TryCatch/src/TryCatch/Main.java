package TryCatch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSubjects;
		int [] marks = new int[5];
		int total;
		double avg;
		try {
		// 1. Input a value for maxSubjects
		// from keyboard
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr max subjects: ");
			maxSubjects = sc.nextInt();
			
		// 2. Using a for loop
		// input marks
			for(int i=0 ; i<4 ; i++) {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Input Marks: ");
				marks[i] = sc1.nextInt();
				
				    
			}
		// 3. Calculate the avg marks
			
			int avg = 
		// 4. Use a try catch block to
		// prevent the following
		// run time errors
		// (a) Input valid integers to the
		// inputs
		// (b) ArithmeticException division
		// by zero
		// (c) ArrayIndexOutOfBounds
		// Exception
			
		} catch (Exception e) {
		}
		finally {
		System.out.println("This code will be gurrentied to run");
		}
		System.out.println("The end");	

	}

}
