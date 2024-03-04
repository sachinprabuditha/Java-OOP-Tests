package Question02A;

import java.util.ArrayList;

public class TCalculation<T extends Number> {
	private ArrayList<T> numList;

	public TCalculation() {
		super();
		this.numList = new ArrayList<>();
	}
	
	public void append(T value) {
		numList.add(value);
	}
	
	public double average() {
		if(numList.isEmpty()) {
			return 0.0;
		}
		
		double sum = 0.0;
		for (T t : numList) {
			sum = sum + t.doubleValue();
		}
		return sum/numList.size();
	}

}
