package abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String s){
		if(s.equalsIgnoreCase("shape"))
			return new ShapeFactory();
		else
			return new ColorFactory();
	}

}
