package observer;

public class Main {

	public static void main(String[] args) {

		Subject s = new Subject();
		
		new BinaryObserver(s);
		new OctalObserver(s);
		new HexaObserver(s);
		
		
		s.setState(10);
		System.out.println("-------------------------");
		
		s.setState(13);
		System.out.println("-------------------------");
		
		s.setState(34);
	}

}
