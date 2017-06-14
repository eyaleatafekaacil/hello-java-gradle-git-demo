package hello;

public class DefaultMessageGenerator implements MessageGenerator {

	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
