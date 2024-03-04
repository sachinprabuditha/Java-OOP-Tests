package Tutorial2;

import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private double[] marks;
	private double avg;


public Student(int id, String name, int marks[], double avg) {
	this.id = id;
	this.name = name;
	this.marks = new double[3];
}
public void inputMarks() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Id: ");
	id = sc.nextInt();
	
	System.out.print("Enter Name: ");
	name = sc.next();
	
	for(int i=0 ; i<3 ; i++) {
		System.out.print(("Enter marks Subject ") + (i+1) + ":");
		marks[i] = sc.nextDouble();
		
	}
}
public void CalculateAvg() {
	double total = 0;
	
	for (double mark : marks) {
        total += mark;
    }
	avg = total/ marks.length;
}

public void displayDetails() {
    System.out.println("Student ID: " + id);
    System.out.println("Student Name: " + name);
    System.out.println("Average Marks: " + avg);
}

}
public class Marks {

	public Marks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(0, null, null, 0);
        student.inputMarks();
        student.CalculateAvg();
        student.displayDetails();

	}

}
