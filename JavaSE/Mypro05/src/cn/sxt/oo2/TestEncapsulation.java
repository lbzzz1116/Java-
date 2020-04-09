package cn.sxt.oo2;
/**
 * 测试封装
 * @author lbzzz
 *
 */
import cn.sxt.oo2.Human;
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "hehe";
		
		Person4 p4 = new Person4();
		p4.setAge(-2);
		
	}
}


class Boy extends Human{
	void sayHello() {
		//System.out.println(age);//子类不能使用父类的私有属性和方法
	}
}