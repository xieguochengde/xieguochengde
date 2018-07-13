package day03lianxi5;

public class Test1 {

	public static void main(String[] args) {
		Person p=new Student();
		p.name="老王";
		System.out.println(p.name);
		System.out.println(p.age);
		p.eat();
		p.sleep();
		Student s=new Student();
		Person p2=s;

	}

}
