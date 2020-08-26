package bridge1;

public class Main {

	public static void main(String[] args) {
		
		Shape redCircle = new Circle(10, 1, 2, new RedCircle());
		Shape greenCircle = new Circle(13,5,3, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
