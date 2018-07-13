package zuoye1;

/*4.定义测试类Test
a)提供main方法
b)在main方法中
	i.创建Audi车对象 a,调用跑方法
	ii.创建SmartAudi车对象 sa,调用跑,自动泊车,自动驾驶方法
	iii.定义Audi类型的变量 aa 把sa赋值aa; 测试aa只能调用run方法,不能调用其他方法
	iv.判断如果aa是SmartAudi的实例对象, 把aa强制转换为saa;使用saa调用自动泊车和自动驾驶方法
	v.定义Smart类型的变量 s,把sa赋值给s,测试只能调用自动泊车和自动驾驶方法,不能调用run方法.*/
public class Test {
	public static void main(String[] args) {
		Audi a=new Audi();
		a.run();
		SmartAudi sa=new SmartAudi();
	/*	sa.run();sa.automaticDrive();sa.automaticParking();
		Audi aa=sa;
		aa.run();
		SmartAudi saa=(SmartAudi)aa;
		saa.automaticDrive();saa.automaticParking();*/
		Smart s=sa;
		s.automaticDrive();s.automaticParking();
	}
}
