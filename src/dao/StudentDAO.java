package dao;

import java.util.List;

public interface StudentDAO {
	
	public List<Student> getStudents();
	public void addStudent(Student s);
	public void deleteStudent(Student s);

}
