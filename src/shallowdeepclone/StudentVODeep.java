package shallowdeepclone;

public class StudentVODeep implements Cloneable {
	
	private String name;
	private SubjectVO subj;
	
	public StudentVODeep(String name, String subject){
		this.name = name;
		this.subj = new SubjectVO(subject);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SubjectVO getSubj() {
		return subj;
	}

	public void setSubj(SubjectVO subj) {
		this.subj = subj;
	}
	
	
	public Object clone(){
		StudentVODeep stud = new StudentVODeep(name, subj.getName());
		return stud;
	}

}
