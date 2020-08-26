package mvc;

public class StudentController {
	
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view){
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name){
		model.setName(name);
	}
	
	public void setStudentRollNo(int rollNo){
		model.setRollNo(rollNo);
	}
	
	public String getStudentName(){
		return model.getName();
	}
	
	public int getStudentRollNo(){
		return model.getRollNo();
	}
	
	public void displayView(){
		view.updateView(model.getName(),model.getRollNo());
	}

}
