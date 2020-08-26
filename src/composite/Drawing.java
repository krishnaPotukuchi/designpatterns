package composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	
	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String fillColor) {
		for (Shape s : shapes) {
			s.draw(fillColor);
		}
	}
	
	public void add(Shape s){
		shapes.add(s);
	}

	public void remove(Shape s){
		shapes.remove(s);
	}
	
	public void clear(){
		System.out.println("Clearing all the shapes for drawing...");
		this.shapes.clear();
	}
}
