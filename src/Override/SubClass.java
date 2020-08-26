package Override;


public class SubClass extends Base {
	
	protected B getName() {
		return new B();
	}
}
