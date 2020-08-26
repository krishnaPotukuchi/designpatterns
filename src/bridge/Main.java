package bridge;

public class Main {

	public static void main(String[] args) {
		
		Shape triangleRed = new Triangle(new Red());
		triangleRed.applyColor();
		
		Shape squareRed = new Square(new Red());
		squareRed.applyColor();
		
		Shape triangleGreen = new Triangle(new Green());
		triangleGreen.applyColor();
		
		Shape squareGreen = new Square(new Green());
		squareGreen.applyColor();

	}

}
