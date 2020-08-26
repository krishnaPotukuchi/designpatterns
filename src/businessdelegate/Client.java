package businessdelegate;

public class Client {
	
	BusinessDelegate bd;
	
	public Client(BusinessDelegate bd){
		this.bd = bd;
	}
	
	public void doTask(){
		bd.doTask();
	}

}
