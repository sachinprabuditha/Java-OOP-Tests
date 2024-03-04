package SS;

import java.util.Scanner;


public class Student {
    private int studentId;
    private String studentName;
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    private double averageMarks;

    public Student(int id, String name) {
        studentId = id;
        studentName = name;
        subject1Marks = 0;
        subject2Marks = 0;
        subject3Marks = 0;
        averageMarks = 0;
    }

    public void calculateAverage() {
        averageMarks = (subject1Marks + subject2Marks + subject3Marks) / 3;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Average Marks: " + averageMarks);
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        subject1Marks = scanner.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        subject2Marks = scanner.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        subject3Marks = scanner.nextDouble();
    }
}
