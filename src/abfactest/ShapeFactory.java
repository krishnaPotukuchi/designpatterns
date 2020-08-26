package abfactest;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("circle")){
				return new Circle();
		}else if(shape.equalsIgnoreCase("square")){
			return new Square();	
		}else if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else {
			return null;
		}
		
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
