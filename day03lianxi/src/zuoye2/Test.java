package zuoye2;
/*请使用代码描述:    
所有飞机(Plane)都具有飞(fly)的功能，但是战斗机(Battleplane)除了具有飞的功能外，还具有发射炮弹(fire)的功能！
要求:在测试类中创建战斗机对象,分别调用fly和fire方法; 然后测试向上转型(转换为父类类型和实现的接口类型)和向下转型.

4.定义测试类(Test)
a)创建战斗机(Battleplane)的对象 bp,调用飞和发射炮弹功能
b)把bp赋值给 Plane p,
i.尝试调用fly和fire方法
ii.先判断p是否是Battleplane的实例对象,如果是把p向下转型为Battleplane,然后调用fire方法
c)把bp赋值给 Fireing 类型 f 变量
i.尝试使用使用f调用fly和fire方法
ii.先判断f是否是Battleplane的实例对象,如果是把f向下转为为Battleplane,然后调用fly方法*/

public class Test {

	public static void main(String[] args) {
		Battleplane bp=new Battleplane();
		Plane p=bp;
		p.fly();
		if (p instanceof Battleplane) {
			Battleplane cp=(Battleplane)p;
			cp.fire();
		}
		Firing f=bp;
		f.fire();
		if (f instanceof Battleplane) {
			Battleplane b=(Battleplane)f;
			b.fly();
		}
	}

}
