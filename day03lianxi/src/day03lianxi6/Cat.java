package day03lianxi6;

public class Cat implements Animal{
public static final int a=200;

	public void eat() {
		System.out.println(a);
		System.out.println("猫吃鱼");
	}

	public void sleep() {
		System.out.println("猫睡觉");
	}
	public void catchMouse(){
		System.out.println("猫捉老鼠");
	}
}
