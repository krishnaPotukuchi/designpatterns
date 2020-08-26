package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

	List<Student> students = new ArrayList<Student>();
	
	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student s) {
		students.add(s);

	}

	public void deleteStudent(Student s) {
		students.remove(s);

	}

}
