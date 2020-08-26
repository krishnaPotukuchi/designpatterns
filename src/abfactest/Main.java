package abfactest;

public class Main {

	public static void main(String[] args) {
		AbstractFactory ab;
		ab = AbstractProducer.getAbsFactory("shape");
		
		Shape s;
		s = ab.getShape("circle");
		s.draw();
		
		s = ab.getShape("square");
		s.draw();
		
		s = ab.getShape("rectangle");
		s.draw();
		
		ab = AbstractProducer.getAbsFactory("color");
		Color c;
		
		c = ab.getColor("red");
		c.fill();
		
		c = ab.getColor("blue");
		c.fill();
		
		c = ab.getColor("green");
		c.fill();
	}

}
