package oop1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr 5 integer Values: ");
		
		for (int i=0 ; i<5 ; i++) {
			int number = sc.nextInt();
			numbers.add(number);
		}
		
		System.out.println("Input-> " + numbers);
		
		ArrayListOperations.removeOddNumbers(new ArrayList<>(numbers));
		ArrayListOperations.removeOddNumbers(new ArrayList<>(numbers));

	}

}
