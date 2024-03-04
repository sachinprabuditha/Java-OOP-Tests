package Ques02b;

public class ParrallelThread {
	
	private Calculation myCalc;
	private int start, end;
	
	

	public ParrallelThread(Calculation myCalc, int start, int end) {
		super();
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}
	public ParrallelThread() {
		// TODO Auto-generated constructor stub
	}
	
	public void Factorial(){
		myCalc.Factorial(start, end);
	}

}
