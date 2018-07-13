package day03lianxi6;

public class Test2 {

	public static void main(String[] args) {
		Cat c=new Cat();
		callEat(c);
		Dog d=new Dog();
		callEat(d);
	}
	public static void callEat(Animal a){
		a.eat();
	}

}
