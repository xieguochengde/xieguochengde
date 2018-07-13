package zuoye1;

/*奥迪车(Audi)都具有跑的功能，但是智能奥迪车(SmartAudi)除了具有跑的功能外，还具有自动泊车(automaticParking)和无人驾驶(automaticDrive)的功能！
要求:在测试类中创建Audi车对象和智能奥迪车对象,分别调用各自方法; 然后测试向上转型(转换为父类类型和实现的接口类型)和向下转型.

操作步骤描述
1.定义奥迪车类(Audi)
a)成员方法: 跑(run())
	i.输出格式: 奥迪车在跑

*/
public class Audi {
	public void run() {
		System.out.println("奥迪车在跑");
	}
}
