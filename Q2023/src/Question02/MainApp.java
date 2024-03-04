package Question02;

public class MainApp {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<String, Integer>("Test 1", 42);
		Pair<String, Double> p2 = new Pair<String, Double>("Test2", 3.14);
		
		System.out.println("Printing FIrst Pair");
		System.out.println("First Value: " + p1.getFirst());
		System.out.println("Second Value: " + p1.getSecond());
		
		System.out.println();
		
		System.out.println("Printing Second Pair");
		System.out.println("First Value: " + p2.getFirst());
		System.out.println("Second Value: " + p2.getSecond());

	}

}
