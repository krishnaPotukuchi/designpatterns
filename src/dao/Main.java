package dao;

public class Main {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImpl();
		Student s1 = new Student("Krishna",1);
		Student s2 = new Student("Vemana",2);
		dao.addStudent(s1);
		dao.addStudent(s2);
		//dao.deleteStudent(s1);
		for (Student s : dao.getStudents()) {
			System.out.println("Name="+s.getName()+",  Roll="+s.getRollNo());
		}
	}

}
