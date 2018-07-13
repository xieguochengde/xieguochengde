package zuoye3;

public class Parrot extends Animal {

	public void eat() {
		System.out.println("鹦鹉吃小米");
	}
	public void say(){
		System.out.println("鹦鹉说活");
	}
	public Parrot() {
		super();

	}
	public Parrot(String color, int age) {
		super(color, age);
	}
	

}
