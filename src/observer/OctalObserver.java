package observer;

public class OctalObserver extends Observer {
	
	public OctalObserver(Subject s){
		this.subject = s;
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("OctalObserver: "+Integer.toOctalString(subject.getState()));
	}

}
