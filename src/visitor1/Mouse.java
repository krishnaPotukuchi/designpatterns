package visitor1;

public class Mouse implements ComputerPart {

	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);

	}

}
