package Question01;

public class Pet implements PointAllocator {
	private int points;

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPoints(int points) {
		// TODO Auto-generated method stub
		
	}
	
	public void feed() {
		points = points + 5;
		System.out.println("Feeding the " + getClass().getSimpleName());
	}
	
	public void clean(){
		points = points + 10;
		System.out.println("Feeding the " + getClass().getSimpleName());
		
	}
	
	public void cuddle() {
		points = points + 15;
		System.out.println("Feeding the " + getClass().getSimpleName());
		
	}
	
	public void GetTotalPoints() {
		System.out.println("Total point is " + getPoints());
		
	}
	
	

}
