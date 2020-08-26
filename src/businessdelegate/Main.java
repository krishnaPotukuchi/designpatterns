package businessdelegate;

public class Main {

	public static void main(String[] args) {

		BusinessDelegate bd = new BusinessDelegate();
		bd.setServiceType("Ejb");
		
		Client c = new Client(bd);
		c.doTask();
		
		bd.setServiceType("");
		c.doTask();
	}

}
