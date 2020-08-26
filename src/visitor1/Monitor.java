package visitor1;

public class Monitor implements ComputerPart {

	public void accept(ComputerPartVisitor visitor) {
			visitor.visit(this);
	}

}
