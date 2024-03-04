package Ex2;

public class Box implements ICompute{
	private int length, width, height;
	private int volume;
	
	public int calculate() {
		volume = length * width * height;
		return volume;
	}
	
	public void display() {
		System.out.println("\nBox");
		System.out.println("Volume: " + getVolume());
	}
	
	public Box(int length, int width, int height, int volume) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volume = volume;
	}
	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	

	

}
