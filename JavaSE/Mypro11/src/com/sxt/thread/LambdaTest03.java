package com.sxt.thread;
/*
 * Lambda推导，加入参数
 */
public class LambdaTest03 {
	public static void main(String[] args) {
		new Thread(()->{
			for(int i =0;i<10;i++) {
			System.out.println("一边学习lambda");
			}
		}).start();
		
		new Thread(()->System.out.println("一边学习Java")).start();
	}
}
	


//简单多线程使用lambda
//new Thread(()->{...类型体...}).start();