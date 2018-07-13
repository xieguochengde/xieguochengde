package zuoye3;

public class ActedTiger extends Tiger implements Actor{

	public void play() {
		System.out.println("老虎表演钻火圈");
	}

	public ActedTiger() {
		super();
	}

	public ActedTiger(String color, int age) {
		super(color, age);
	}

}
