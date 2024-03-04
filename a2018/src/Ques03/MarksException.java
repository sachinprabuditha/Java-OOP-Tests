package Ques03;

public class MarksException extends Exception{
	
	private int marks;

	public MarksException(int marks) {
		this.marks = marks;
	}

	public MarksException() {
		// TODO Auto-generated constructor stub
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
	
	

}
