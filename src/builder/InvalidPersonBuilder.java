package builder;

public class InvalidPersonBuilder {
	
	private Person person = new Person();
	
	public InvalidPersonBuilder(Person p){
		this.person = p;
	}
	
	public InvalidPersonBuilder withFirstName(String s){
		person.setFirstName(s);
		return this;
	}
	
	public InvalidPersonBuilder withTitle(String s){
		person.setTitle(s);
		return this;
	}
	
	public ValidPersonBuilder withLastName(String s){
		person.setLastName(s);
		return new ValidPersonBuilder(person);
	}

}
