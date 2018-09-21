package a04_inheritance;

public class Circle {
	private final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void diameter() {
		//TODO
		
	}
	
	public void circumference() {
		//TODO
		
	}

	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return getClass() + "(" + getRadius() + ")";
	}
}
