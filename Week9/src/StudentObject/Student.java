package StudentObject;

import java.util.ArrayList;
import java.util.Collection;

public class Student {
	private int studentID;
	private String name;
	private double GPA;

	public Student(int studentID, String name, double GPA) {
		// TODO Auto-generated constructor stub
		this.studentID = studentID;
		this.name = name;
		this.GPA = GPA;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", GPA=" + GPA + "]";
	}
	
	

}
