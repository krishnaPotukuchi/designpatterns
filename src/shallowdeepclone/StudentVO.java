package shallowdeepclone;

public class StudentVO implements Cloneable {
	
	private String name;
	private SubjectVO sub;
	
	public StudentVO(String s, String sub){
		this.name = s;
		this.sub = new SubjectVO(sub);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SubjectVO getSub() {
		return sub;
	}
	public void setSub(SubjectVO sub) {
		this.sub = sub;
	}
	
	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException c){
			return null;
		}
	}
	

}
