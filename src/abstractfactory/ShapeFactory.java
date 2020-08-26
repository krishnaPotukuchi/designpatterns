package abstractfactory;

public class ShapeFactory implements AbstractFactory {

	@Override
	public Shape getShape(String s) {
		if(s.equalsIgnoreCase("circle"))
			return new Circle();
		else if(s.equalsIgnoreCase("square"))
			return new Square();
		else 
			return new Rectangle();
	}

	@Override
	public Color getColor(String c) {
		return null;
	}

}
