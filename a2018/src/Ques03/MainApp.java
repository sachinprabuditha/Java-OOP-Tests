package Ques03;

public class MainApp {

	public static void main(String[] args) throws MarksException {
		// TODO Auto-generated method stub
		
		Student std = new Student(1, "DWWWW");
		
		std.input();
		std.display();
		
		float average = std.getAverage();
		System.out.println("Average: " + average);

	}

}
