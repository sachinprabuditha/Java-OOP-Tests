package Ques03;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Student {
	Scanner sc = new Scanner(System.in);
	
	private int id, noOfSubjects;
	private float marks[];
	private String name;

	public Student(int id, String name){
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public float inputMarks(int index) throws MarksException{
		
		
		System.out.println("Input Marks: ");
		int mark = sc.nextInt();
		
			if(mark < 0 || mark>100) {
				throw new MarksException(mark);
			} 
			else {
				return mark;
			}
	}
	
	public void input() throws MarksException {
		try {
		System.out.println("Input Number of Subjects: ");
		
	    noOfSubjects = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
		marks = new float[noOfSubjects];
		
		for(int i=0 ; i<noOfSubjects ; i++) {
			float mark = inputMarks(i);
			marks[i] = mark;
			
		}
	}
	
	public float getAverage() {
		float total = (float)0.0;
		float avg = (float)0.0;
		
		for (float f : marks) {
			total = total+ f;
		}
		
		try {
			avg = total/noOfSubjects;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		
		
		return avg;
		
		
	}
	public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Number of Subjects: " + noOfSubjects);
        System.out.print("Marks: ");
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
	

}
