package abstractfactory;

public interface AbstractFactory {
	public Shape getShape(String s);
	public Color getColor(String c);
}
