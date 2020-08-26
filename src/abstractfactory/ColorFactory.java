package abstractfactory;

public class ColorFactory implements AbstractFactory {

	@Override
	public Shape getShape(String s) {
		return null;
	}

	@Override
	public Color getColor(String c) {
		if(c.equalsIgnoreCase("red"))
			return new Red();
		else if(c.equalsIgnoreCase("blue"))
			return new Blue();
		else
			return new Green();
	}

}
