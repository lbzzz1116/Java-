package cn.sxt.oop;

public class Teat2 {
    public static void main(String[] args) {
        TestInstrument t1 = new TestInstrument();
    	Instrument i = new ErHu();
    	t1.test("����", i);
    }
}

class Instrument{
	public void makeSound() {
		System.out.println("������������");
	}
}

class ErHu extends Instrument{		//������
	public void makeSound() {
		System.out.println("���ڵ����������");
	}
}
class Piano extends Instrument{		//������
	public void makeSound() {
		System.out.println("���ڵ�����٣���");
	}
}
class Violin extends Instrument{	//С������
	public void makeSound() {
		System.out.println("���ڵ���С���٣���");
	}
}

class Musician{						//������
	public void play(Instrument m) {
		m.makeSound();
	}
}

class TestInstrument{				//������
	public void test(String musicianName,Instrument i) {
		System.out.print(musicianName);
		Musician musician = new Musician();
		musician.play(i);
	}
}


