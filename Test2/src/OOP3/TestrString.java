package OOP3;

import java.util.Scanner;

public class TestrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a String: ");
		String input = sc.next();
		
		String reversed = StringObjectives.reverseString(input);
		int vowelCount = StringObjectives.countVowels(input);
		
		System.out.println("Reverse String: " + reversed);
		System.out.println("Number of vowels: " + vowelCount);

	}

}
