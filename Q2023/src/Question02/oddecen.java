package Question02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class oddecen {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter nunber= {0 to quit): ");
		while(true) {
			num = sc.nextInt();
			if(num == 0) {
				break;
			}
			number.add(num);
		}
		
		for (int i = 0; i < number.size(); i++) {
			if(number.get(i) % 2 == 0) {
				number.remove(i);
				i--;
			}
		}
		System.out.println("Odd Numbers"+ number);
	}

}
