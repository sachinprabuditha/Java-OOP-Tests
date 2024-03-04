package Question01;

import java.util.Scanner;

public class Course {
	public String CourseId;
	public String name;
	public String instructor;
	
	public Course(String courseId, String name, String instructor) {
		super();
		CourseId = courseId;
		this.name = name;
		this.instructor = instructor;
	}
	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Id: ");
		CourseId = sc.next();
		
		System.out.println("Enter Name: ");
		name = sc.next();
		
		System.out.println("Enter Instructor: ");
		instructor = sc.next();
	}
	
	public void AddStudents(Student student) {
		System.out.println("Course Information: ");
		System.out.println("Course ID is : " + CourseId);
		System.out.println("Course Name is : " + name);
		System.out.println("Instructor : " + instructor);
		System.out.println("Enrolled Students: " + student.getName());
	}
	

}
