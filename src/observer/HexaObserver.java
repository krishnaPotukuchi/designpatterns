package observer;

public class HexaObserver extends Observer {
	
	public HexaObserver(Subject s){
		this.subject = s;
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("HexaObserver: "+Integer.toHexString(subject.getState()));
	}

}
