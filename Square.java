package a04_inheritance;

public class Square extends Rectangle{

	public Square(int side) {
		super(side, side);
	}
	
	public int getSide() {
		return super.getLength();
	}
	
	@Override
	public String toString() {
		// Override the toString method so that it 
		// will return a String of the following form:
		// Square(side) e.g. Square(4)
		return getClass().getSimpleName() + "(" + getLength() + ")";
	}

}
