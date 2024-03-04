package Point;

import java.util.Scanner;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Point 1: ");
		int x1 = sc.nextInt();
		System.out.print("Point 2: ");
		int y1 = sc.nextInt();
		System.out.print("Point 3: ");
		int z1 = sc.nextInt();
		
		System.out.print("\nPoint 1: ");
		int x2 = sc.nextInt();
		System.out.print("Point 2: ");
		int y2 = sc.nextInt();
		System.out.print("Point 3: ");
		int z3 = sc.nextInt();
		
		Point3D P1 = new Point3D(x1, y1, z1);
		Point3D P2 = new Point3D(x2, y2, z3);
		
		double distance1 = P1.distance();
		double distance2 = P2.distance();
		
		System.out.println("\n1: " + distance1);
		System.out.println("2: " + distance2);
		
		

	}

}
