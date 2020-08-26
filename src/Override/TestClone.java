package Override;

public class TestClone implements Cloneable {
	
	TestClone(){
		try{
			super.clone();
		}catch(CloneNotSupportedException c){
			
		}
	}

	@Override
	public Object clone(){
		return this.clone();
	}
}
