package zuoye3;

public abstract class Animal {
private String color;
private int age;
public abstract void eat();
public Animal(String color, int age) {
	super();
	this.color = color;
	this.age = age;
}
public Animal() {
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
