package day03lianxi2;

import java.util.ArrayList;

public class Interface1 {

	public static void main(String[] args) {
		Jiekoushiixian shixian=new  Jiekoushiixian();
		int age=shixian.getAge();
		System.out.println(age);
		ArrayList<String> list=shixian.getList();
		System.out.println(list);
		System.out.println(shixian.b);
		shixian.show();
		System.out.println(shixian.a);
	}

}
