package visitor1;

public class ComputerPartVisitorImpl implements ComputerPartVisitor {

	public void visit(ComputerPart computer) {
		if(computer instanceof Computer)
			System.out.println("Computer................");
		else if(computer instanceof Keyboard)
			System.out.println("Keyboard................");
		else if(computer instanceof Mouse)
			System.out.println("Mouse................");
		else if(computer instanceof Monitor)
			System.out.println("Monitor................");
		
	}

//	public void visit(Keyboard keyBoard) {
//		System.out.println("Keyboard................");
//
//	}
//
//	public void visit(Mouse mouse) {
//		System.out.println("Mouse................");
//
//	}
//
//	public void visit(Monitor monitor) {
//		System.out.println("Monitor................");
//
//	}

}
