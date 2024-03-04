package Question01;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<>();
		ArrayList<Course> corList = new ArrayList<Course>();
		
		Student std1 = new Student(" ", " ", " ", " ");
		Student std2 = new Student(" ", " ", " ", " ");
		
		std1.Read();
		std2.Read();
		
		Course cor1 = new Course(" ", " ", " ");
		
		cor1.Read();
		
		cor1.AddStudents(std1);
		
		stdList.add(std1);
		stdList.add(std2);
		
		corList.add(cor1);
		
		for (Student student : stdList) {
			student.Print();
			System.out.println();
		}
		
		for (Course course : corList) {
			course.AddStudents(std1);
			System.out.println();
		}

	}

}
