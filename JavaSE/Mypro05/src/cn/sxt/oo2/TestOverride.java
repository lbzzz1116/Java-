package cn.sxt.oo2;

public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
		//h.ride();
		h.stop();
	}
}

class Vehicle{
	public void run() {
		System.out.println("��......");
	}
	public void stop() {
		System.out.println("ֹͣ������");		
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("���㷭�ɣ��N�N�N......");

	}
}
