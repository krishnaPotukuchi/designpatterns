package visitor1;

public class Computer implements ComputerPart {
	
	ComputerPart[] parts;
	
	public Computer(){
		parts = new ComputerPart[]{new Keyboard(),new Mouse(), new Monitor()};
	}

	public void accept(ComputerPartVisitor visitor) {
		for(int i=0;i<parts.length;i++){
			parts[i].accept(visitor);
		}
			visitor.visit(this);
	}

}
