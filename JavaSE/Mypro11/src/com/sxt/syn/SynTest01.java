package com.sxt.syn;
/*
 * 线程安全，在并发时保证数据的正确性、效率尽可能高
 * synchronized
 * 1、同步方法
 * 2、同步块
 * 
 */
public class SynTest01 {
	public static void main(String[] args) {
		//一份资源
		safeWeb12306 web = new safeWeb12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"码畜").start();
		new Thread(web,"码农").start();
		new Thread(web,"码蟥").start();
	}
}
class safeWeb12306 implements Runnable{
	private int ticketNums = 10;
	private boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			test();
		}
	}
	public synchronized void test() {
		if(ticketNums<0) {
			flag = false;
			return;
		}
		//模拟延时
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//睡眠200ms
		System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);			
	}
}