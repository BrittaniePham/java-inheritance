/* 
* Brittanie Pham
* CSIS1410
* A04 Inheritance
*/

package a04_inheritance;

public class Rectangle {
	private final int length;
	private final int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + getLength() + "x" + getWidth() + ")";	
	}	
}
