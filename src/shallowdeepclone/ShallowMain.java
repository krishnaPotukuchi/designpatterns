package shallowdeepclone;

public class ShallowMain {

	public static void main(String[] args) {
		
		StudentVO stud = new StudentVO("Krishna","Physics");
		System.out.println("Original Object:");
		System.out.println("Name="+stud.getName()+", subject="+stud.getSub().getName());
		
		StudentVO cloneSubj = (StudentVO)stud.clone();
		System.out.println("Cloned Object:");
		System.out.println("Name="+cloneSubj.getName()+", subject="+cloneSubj.getSub().getName());
		
		System.out.println("---------------------------------------------");
		stud.setName("Vishnu");
		stud.getSub().setName("Chemistry");
		
		System.out.println("Original Object:");
		System.out.println("Name="+stud.getName()+", subject="+stud.getSub().getName());
		
		System.out.println("Cloned Object:");
		System.out.println("Name="+cloneSubj.getName()+", subject="+cloneSubj.getSub().getName());
		
	}
}
