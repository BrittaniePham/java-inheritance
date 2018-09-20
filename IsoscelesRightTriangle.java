package a04_inheritance;

public class IsoscelesRightTriangle {
	private final int leg;
	
	public IsoscelesRightTriangle(int leg) {
		this.leg = leg;
	}
	
	public double hypotenuse() {
		return leg; //todo
	}

	public int getLeg() {
		return leg;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass() + "(" + getLeg() + ")";	
	}
}
