package zuoye3;

public class ZooManager {
	private String color;
	private int age;

	public void feed(Animal a) {
		a.eat();
	}
	public void ltItShow(Actor a){
		a.play();
	}
	public ZooManager(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}
	public ZooManager() {
		super();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
