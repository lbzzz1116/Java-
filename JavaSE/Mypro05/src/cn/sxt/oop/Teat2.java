package cn.sxt.oop;

public class Teat2 {
    public static void main(String[] args) {
        TestInstrument t1 = new TestInstrument();
    	Instrument i = new ErHu();
    	t1.test("高琪", i);
    }
}

class Instrument{
	public void makeSound() {
		System.out.println("乐器发出声音");
	}
}

class ErHu extends Instrument{		//二胡类
	public void makeSound() {
		System.out.println("正在弹奏二胡！！");
	}
}
class Piano extends Instrument{		//钢琴类
	public void makeSound() {
		System.out.println("正在弹奏钢琴！！");
	}
}
class Violin extends Instrument{	//小提琴类
	public void makeSound() {
		System.out.println("正在弹奏小提琴！！");
	}
}

class Musician{						//乐手类
	public void play(Instrument m) {
		m.makeSound();
	}
}

class TestInstrument{				//测试类
	public void test(String musicianName,Instrument i) {
		System.out.print(musicianName);
		Musician musician = new Musician();
		musician.play(i);
	}
}


