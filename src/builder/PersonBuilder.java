package builder;

public class PersonBuilder {
	
	private Person person = new Person();
	
	public ValidPersonBuilder withLastName(String lName){
		person.setLastName(lName);
		return new ValidPersonBuilder(person);
	}
	
	public InvalidPersonBuilder withFirstName(String fName){
		person.setFirstName(fName);
		return new InvalidPersonBuilder(person);
	}
	
	
	public InvalidPersonBuilder withTitle(String title){
		person.setTitle(title);
		return new InvalidPersonBuilder(person);
	}
	

}
