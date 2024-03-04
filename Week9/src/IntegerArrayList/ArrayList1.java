package IntegerArrayList;

import java.util.Scanner;
import java.util.ArrayList;


public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		
		if(numbers.isEmpty()) {
			System.out.println("ArrayList is Empty.");
		}
		else {
			System.out.println("ArrayList is not Empty.");
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<10 ; i++) {
			System.out.print("Enter a Number: ");
			int num = sc.nextInt();
			numbers.add(num);
		}
		
		int total = 0;
		System.out.print("Entered numbers: ");
		for (int num : numbers) {
			System.out.print(num + ", ");
			total = total + num;
		}
		
		System.out.println("\nTotal: " + total);
		
		
		

	}

}
