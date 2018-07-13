package day03lianxi6;

public class Test33 {

	public static void main(String[] args) {
		Animal a2=new Cat();
		Cat c2=(Cat)a2;
		c2.catchMouse();
		Animal d=new Dog();
		Dog d1=(Dog)d;
		d1.lookHome();
		boolean b=a2 instanceof Dog;
		boolean le=a2 instanceof Cat;
		System.out.println(le);
		System.out.println(b);
	}

}
