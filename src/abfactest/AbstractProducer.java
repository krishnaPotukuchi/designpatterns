package abfactest;

public class AbstractProducer {
	
	public static AbstractFactory getAbsFactory(String s){
		if(s.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}else if(s.equalsIgnoreCase("color")){
			return new ColorFactory();
		}else{
			return null;
		}
	}

}
