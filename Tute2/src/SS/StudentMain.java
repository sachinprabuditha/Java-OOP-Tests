package SS;

import java.util.Scanner;

public class StudentMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter student ID: ");
	        int studentId = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline
	        System.out.print("Enter student name: ");
	        String studentName = scanner.nextLine();

	        // Create a Student object
	        Student student = new Student(studentId, studentName);

	        // Input marks for three subjects
	        student.inputMarks();

	        // Calculate and display average marks
	        student.calculateAverage();
	        student.displayDetails();

	}

}
