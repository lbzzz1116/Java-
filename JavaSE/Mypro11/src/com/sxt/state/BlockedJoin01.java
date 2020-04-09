package com.sxt.state;
/*
 * join：合并线程，插队线程，
 */
public class BlockedJoin01 {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(()-> {
			for(int i=0;i<100;i++) {
				System.out.println("lambda"+i);
			}
		});//join是对象多次使用不能用匿名
		t.start();
		
		for(int i=0;i<100;i++) {
			if(i==20) {
				t.join();//插队，join多次执行直至执行完。main礼让
			}
			System.out.println("main....."+i);
		}
	}
}
