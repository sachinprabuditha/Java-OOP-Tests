package Question02;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter 0 to quite: ");
		while (true) {
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			numbers.add(num);
		}
		
		for (int i=0 ; i< numbers.size() ; i++) {
			if(numbers.get(i) % 2 == 0) {
				numbers.remove(i);
				i--;
			}
		}
		
		System.out.println("Odd Numbers: " + numbers);

	}

}
