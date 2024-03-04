package Ques02b;

public class Calculation {
	
	public double ans;

	public Calculation() {
		// TODO Auto-generated constructor stub
	}

	public double getAns() {
		return ans;
	}
	
	void Factorial(int start, int end) {
		
		ans = 1;
		
		for(int i=start ; i<end ; i++) {
			ans = ans*i;
		}
		
	}

}
