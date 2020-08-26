package abstractfactory;

public class Main {
	public static void main(String[] args) {
		AbstractFactory af;
		af = FactoryProducer.getFactory("shape");
		
		Shape s;
		s = af.getShape("circle");
		s.draw();
		
		s= af.getShape("square");
		s.draw();
		
		s = af.getShape("Rect");
		s.draw();
		
		Color c;
		af = FactoryProducer.getFactory("");
		
		c = af.getColor("red");
		c.fill();
		
		c = af.getColor("blue");
		c.fill();
		
		c = af.getColor("green");
		c.fill();
				
	}

}
