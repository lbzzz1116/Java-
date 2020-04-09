package cn.sxt.oop;
/**
 * 测试接口和实现类
 * @author lbzzz
 *
 */
public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angel();
		v.fly();
		Honest h = new GoodMan();
		h.helpOther();
	}
}

//飞行接口
interface Volant{
	int FLY_HEIGHT = 1000;
	void fly();
}

interface Honest{
	void helpOther();
}

class Angel implements Volant,Honest{//实现类可以实现多个父接口
	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther()");// TODO Auto-generated method stub	
	}
	@Override
	public void fly() {
		System.out.println("Angel.fly()");// TODO Auto-generated method stub		
	}
}

class GoodMan implements Honest{
	@Override
	public void helpOther() {
		System.out.println("GoodMan.helpOther()");// TODO Auto-generated method stub
	}
}

class BirdMan implements Volant{
	@Override
	public void fly() {
		System.out.println("BirdMan.fly()");// TODO Auto-generated method stub
	}
}






