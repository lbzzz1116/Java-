package com.sxt.syn;
/*
 * 线程安全
 */
public class SynTest05 {
	public static void main(String[] args) {
		//一份资源
		SynWeb12306 web = new SynWeb12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"码畜").start();
		new Thread(web,"码农").start();
		new Thread(web,"码蟥").start();
	}
}
class SynWeb12306 implements Runnable{
	private int ticketNums = 10;
	private boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			test2();
		}
	}
	//同步块
	public synchronized void test2() {
		synchronized (this) {
			if(ticketNums<=0) {
				flag = false;
				return;
			}
			if(ticketNums<=0) {//考虑最后一张票
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
	
	//线程安全 同步
	public synchronized void test1() {
		if(ticketNums<=0) {
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