package bridge1;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing circle[ color: Green] with radius="+radius+", x="+x+",y="+y);
	}

}
