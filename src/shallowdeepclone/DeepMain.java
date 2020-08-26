package shallowdeepclone;

public class DeepMain {

	public static void main(String[] args) {

		StudentVODeep stud = new StudentVODeep("Krishna", "Maths");
		System.out.println("Original Object");
		System.out.println("Name="+stud.getName()+", subject="+stud.getSubj().getName());
		
		StudentVODeep cloned = (StudentVODeep)stud.clone();
		System.out.println("Cloned Object");
		System.out.println("Name="+cloned.getName()+", subject="+cloned.getSubj().getName());
		
		System.out.println("----------------------------------------");
		
		stud.setName("Vishnu");
		stud.getSubj().setName("Physics");
		
		System.out.println("Original Object");
		System.out.println("Name="+stud.getName()+", subject="+stud.getSubj().getName());
		
		System.out.println("Cloned Object");
		System.out.println("Name="+cloned.getName()+", subject="+cloned.getSubj().getName());
	}

}
