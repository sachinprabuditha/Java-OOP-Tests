package Question02;

public class Pair <T,U>{
	private T value1;
	private U value2;
	
	public Pair(T value1, U value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public T getFirst() {
		return value1;
		
	}
	
	public U getSecond() {
		return value2;
		
	}

}
