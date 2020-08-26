package proxy;

public class ProxyImage implements Image {
	
	RealImage real;
	String fileName;

	public ProxyImage(String s){
		this.fileName = s;
	}
	
	public void display() {
		if(fileName != null)
				real = new RealImage(fileName);
		
		System.out.println("Proxy............."+fileName);
		real.display();
	}

}
