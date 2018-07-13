package zuoye3;

public class ActedParrot extends Parrot implements Actor{

	public void play() {
		System.out.println("鹦鹉表演过翘翘板");
	}

	public ActedParrot() {
		super();
	}

	public ActedParrot(String color, int age) {
		super(color, age);
	}

}
