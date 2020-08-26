package observer;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject s){
		this.subject = s;
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary Observer: "+Integer.toBinaryString(subject.getState()));
	}

}
