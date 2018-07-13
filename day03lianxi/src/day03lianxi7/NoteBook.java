package day03lianxi7;

public class NoteBook {
public void run(){
	System.out.println("电脑正在运行");
}
public void shutDown(){
	System.out.println("电脑关机了");
}
public void useUsb(USB usb){
	usb.close();
	usb.open();
	
}
}
