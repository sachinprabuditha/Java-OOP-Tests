package Question02A;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TCalculation<Integer> intCal = new TCalculation<>();
		intCal.append(5);
		intCal.append(15);
		intCal.append(25);
		
		TCalculation<Double> doubleCald = new TCalculation<>();
		doubleCald.append(35.3);
		doubleCald.append(45.4);
		doubleCald.append(55.6);
		
		double daverage = doubleCald.average();
		System.out.println("Average Values: " + daverage);

	}

}
