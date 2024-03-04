package StudentObject;

import java.util.Collection;
import java.util.ArrayList;

public class StudentListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "John", 3.5));
		studentList.add(new Student(2, "Alice", 3.4));
		studentList.add(new Student(3, "Bob", 3.3));
		
		for(Student student : studentList) {
			System.out.println(student);
		}

	}

}
