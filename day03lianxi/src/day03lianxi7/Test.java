package day03lianxi7;

public class Test {

	public static void main(String[] args) {
		Mouse m=new Mouse();
		KeyBoad kb=new KeyBoad();
		NoteBook nb=new NoteBook();
		nb.run();
		nb.useUsb(m);
		nb.useUsb(kb);
		nb.shutDown();
	}

}
