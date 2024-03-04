package Lab3;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Student std1 = new Student("AAAa", "SSSSS", "FFFFF");
		
		System.out.println("Name: ");
		String name = sc.next();
		
		System.out.println("Name: " + name);
		System.out.println("DT Number: " + std1.getDitno());
		System.out.println("");
		

	}

}
