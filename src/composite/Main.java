package composite;

public class Main {

	public static void main(String[] args) {
		
		Shape triangle = new Triangle();
		Shape circle = new Circle();
		
		Drawing drawing = new Drawing();
		
		drawing.add(triangle);
		drawing.add(circle);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(triangle);
		drawing.add(circle);
		
		drawing.draw("Blue");

	}

}
