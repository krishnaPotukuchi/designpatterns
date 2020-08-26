package bridge1;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("Drawing circle[ color: Red] with radius="+radius+", x="+x+",y="+y);
	}

}
