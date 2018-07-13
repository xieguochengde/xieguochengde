package day03lianxi2;

import java.util.ArrayList;

public class Jiekoushiixian implements MyInterface {
int b=200;
public void show(){
	System.out.println("show方法");
}

	public ArrayList<String> getList() {
	ArrayList<String> list=new ArrayList<>();
	list.add("JavaEE");
	list.add("Pythhon");
	return list;
	}

	public int getAge() {
		int a=10;
		return a;
	}

}
