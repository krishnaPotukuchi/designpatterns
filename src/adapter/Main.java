package adapter;

public class Main {

	public static void main(String[] args) {
		SocketAdapter sa = new SocketClassAdapterImpl();
		
		System.out.println(sa.get120Volt().getVolts());
		
		System.out.println(sa.get3Volt().getVolts());
		
		System.out.println(sa.get12Volt().getVolts());
		
		
	}

}
