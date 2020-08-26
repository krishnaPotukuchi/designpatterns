package builder;

public class Main {

	public static void main(String[] args) {
		Person p = new PersonBuilder().withFirstName("Krishna").withTitle("MR").withLastName("Potukuchi").build();
		System.out.println(p);
	}

}
