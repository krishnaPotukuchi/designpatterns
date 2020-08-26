package proxy;

public class RealImage implements Image {
	
	private String fileName;
	
	public RealImage(String fn){
		this.fileName = fn;
		loadFile(fn);
		
	}

	public void display() {
		System.out.println("Real Image Display()...."+fileName);
	}

	private void loadFile(String s){
		System.out.println("Loading Image file..."+s);
	}
}
