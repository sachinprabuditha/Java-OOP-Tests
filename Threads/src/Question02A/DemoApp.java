package Question02A;

public class DemoApp {

	public static void main(String[] args) {
		TCalculation<Integer> obj = new TCalculation<>();
		TCalculation<Double> obj2 = new TCalculation<Double>();
		
		obj.append(3);
		obj.append(5);
		obj.append(4);
		
		obj2.append(2.5);
		obj2.append(4.6);
		obj2.append(1.0);
		
		System.out.println("Int: " + obj.average());
		System.out.println("Double: " + obj2.average());

	}

}
