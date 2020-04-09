package cn.sxt.oo2;

import cn.sxt.oo2.Human;

public class TestEncapsulation2 {
	public static void main(String[] args) {
		Human h = new Human();
		h.sayAge();
	}
}

class Girl extends Human{
	void sayGood() {
		System.out.println(height);
	}
}