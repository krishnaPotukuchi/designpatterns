package bridge1;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI da){
		this.drawAPI = da;
	}

	public abstract void draw();
}
