package hello;

public class Application {
	private MessageGenerator messageGenerator;

	public Application(MessageGenerator messageGenerator) {
		super();
		this.messageGenerator = messageGenerator;
	}

	public void run(){
		System.err.println(this.messageGenerator.getMessage());
	}
	
	public static void main(String[] args) {
		new Application(new DefaultMessageGenerator()).run();
	}
}
