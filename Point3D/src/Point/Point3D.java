package Point;

public class Point3D {
	private int x;
	private int y;
	private int z;

	public Point3D(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public double distance() {
		double distance = Math.sqrt(x*x + y*y + z*z);
		return distance;
	}

}
