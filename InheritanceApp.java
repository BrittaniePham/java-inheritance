package a04_inheritance;

public class InheritanceApp {
	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(5,4);
		Square mySquare = new Square(4);
		IsoscelesRightTriangle myIsoscelesRightTriangle = new IsoscelesRightTriangle(5);
		Circle myCircle = new Circle(4);
		
		System.out.println(myRectangle.toString());
		System.out.println("Length: " + myRectangle.getLength());
		System.out.println("Width: " + myRectangle.getWidth());
		System.out.println();
		
		System.out.println(mySquare.toString());
		System.out.println("Side: " + mySquare.getSide());
		System.out.println();
		
		System.out.println(myIsoscelesRightTriangle.toString());
		System.out.println("Leg: " + myIsoscelesRightTriangle.getLeg());
		System.out.println("Hypotenuse: " + myIsoscelesRightTriangle.hypotenuse());
		System.out.println();
		
		System.out.println(myCircle.toString());
		System.out.println("Diameter: " + myCircle.diameter());
		System.out.println("Circumference: " + myCircle.circumference());
		System.out.println("Radius: " + myCircle.getRadius());
		System.out.println();
		
		Rectangle rectangle2 = mySquare;
		System.out.println("rectangle2: ");
		System.out.println("-----------");
		System.out.println(rectangle2.toString());
		
	}
}
