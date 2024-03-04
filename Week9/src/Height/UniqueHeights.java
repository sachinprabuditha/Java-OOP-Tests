package Height;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Set<Integer> uniqueHeights = new HashSet<>();
		
		System.out.println("Enter the height of 10 students: ");
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print("Height of Student "+ (i+1)+ ": ");
			int height = scanner.nextInt();
			uniqueHeights.add(height);
		}
		
		System.out.print("Unique heights of the Students: ");
		
		for (int height : uniqueHeights) {
			System.out.print(height+" ,");
		}

	}

}
