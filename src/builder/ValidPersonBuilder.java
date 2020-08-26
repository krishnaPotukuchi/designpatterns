package builder;

public class ValidPersonBuilder {

	
	private Person person;
	
	public ValidPersonBuilder(Person p){
		this.person = p;
	}
	
	public ValidPersonBuilder withLastName(String lName){
		person.setLastName(lName);
		return this;
	}
	
	public ValidPersonBuilder withFirstName(String fName){
		person.setFirstName(fName);
		return this;
	}
	
	
	public ValidPersonBuilder withTitle(String title){
		person.setTitle(title);
		return this;
	}
	
	public Person build(){
		return person;
	}


}
