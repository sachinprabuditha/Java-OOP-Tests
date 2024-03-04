package Question01A;

public class Pet implements PointAllocator {
	
	private double points;

	public Pet() {
		// TODO Auto-generated constructor stub
	}


	public void setPoints(double points) {
		this.points = points;
	}

	@Override
	public double getpoints() {
		// TODO Auto-generated method stub
		return points;
	}
	
	public void feed() {
		points = points + 5;
		System.out.println("Feeding the " + getClass().getSimpleName());

	}
	
	public void clean() {
		points = points + 10;
		System.out.println("Cleaning the " + getClass().getSimpleName());
	}
	
	public void cuddle() {
		points = points + 15;
		System.out.println("Cuddling the " + getClass().getSimpleName());
	}
	
	public void GetTotalPoints() {
		System.out.println("Total point is " + getpoints());
	}

}
