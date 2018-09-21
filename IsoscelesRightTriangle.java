/* 
* Brittanie Pham
* CSIS1410
* A04 Inheritance
*/

package a04_inheritance;

public class IsoscelesRightTriangle {
	private final int leg;
	
	public IsoscelesRightTriangle(int leg) {
		this.leg = leg;
	}
	
	public double hypotenuse() {
		double hyp = Math.hypot(leg, leg);
		return Math.round(hyp * 10) / 10d;
	}

	public int getLeg() {
		return leg;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + getLeg() + ")";	
	}
}
