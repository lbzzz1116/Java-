package com.sxt.state;
/*
 * sleep模拟网络延时，放大了发生问题的可能性
 * 
 */

public class BlockedSleep01 {
	public static void main(String[] args) {
		//一份资源
		Web12306 web = new Web12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"码畜").start();
		new Thread(web,"码农").start();
		new Thread(web,"码蟥").start();
	}
}
class Web12306 implements Runnable{
	private int ticketNums = 99;
	@Override
	public void run() {
		while(true) {
			if(ticketNums<0) {
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//睡眠200ms
			System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);			
		}
	}	
}




