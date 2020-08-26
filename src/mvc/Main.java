package mvc;


public class Main {

	public static void main(String[] args) {

		Student model = getStudentFromBackEnd();
		StudentView view = new StudentView();
		StudentController sc = new StudentController(model, view);
		sc.displayView();
		
		sc.setStudentName("Vishnu");
		sc.displayView();
		
		sc.setStudentRollNo(2);
		sc.displayView();
	}
	
	private static Student getStudentFromBackEnd(){
		Student s = new Student("Krishna",1);
		return s;
	}

}
