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
		System.out.println("ÅÜ......");
	}
	public void stop() {
		System.out.println("Í£Ö¹£¡£¡£¡");		
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("ËÄÌã·­·É£¬‡N‡N‡N......");

	}
}
