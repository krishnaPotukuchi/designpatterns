package dao;

public class Student {
	
	private String name;
	private int rollNo;
	
	public Student(String name, int roll){
		this.name = name;
		this.rollNo = roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Name= "+name+"  roll="+rollNo;
	}
	

}
