package zuoye3;
/*在动物园每一个动物都有颜色和年龄,都会吃
所有老虎都吃肉,但是有的老虎会表演(钻火圈)
所有的大猩猩都吃香蕉,但有大猩猩会表演(骑自行车)
所有的鹦鹉都吃小米和说话,但是有的鹦鹉会表演(过跷跷板)
在动物园中管理员有年龄和姓名,他会喂动物和组织会表演的动物进行演出,如果演出时鹦鹉,还会让鹦鹉说你好*/
/*i.创建会表演的老虎类(ActedTiger)对象t,把颜色赋值为黄色,年龄赋值为2
ii.创建会表演的大猩猩(ActedGorilla)对象g,把颜色赋值黑色,年龄赋值为3
iii.创建会表演的鹦鹉类(ActedParrot)对象 p,把颜色赋值为绿色,年龄赋值1
iv.创建物园管理员类(ZooManager)对象zm,把名称赋值邓超,年龄赋值30
1.调用三次zm对象的喂养动物(feed(Animal a))方法,分别传入t,g,p对象
2.调用三次zm对象的组织表演(letItShow(Actor a))方法,分别传入t,g,p对象*/

public class Test {

	public static void main(String[] args) {
		ActedTiger t=new ActedTiger();
		ZooManager zm=new ZooManager("邓超",30);
	}

}
