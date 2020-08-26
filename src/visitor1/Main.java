package visitor1;

public class Main {

	public static void main(String[] args) {
		ComputerPart c = new Computer();
		c.accept(new ComputerPartVisitorImpl());
		
	}

}
