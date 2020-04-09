package com.sxt.syn;
/*
 * �̰߳�ȫ���ڲ���ʱ��֤���ݵ���ȷ�ԡ�Ч�ʾ����ܸ�
 * synchronized
 * 1��ͬ������
 * 2��ͬ����
 * 
 */
public class SynTest01 {
	public static void main(String[] args) {
		//һ����Դ
		safeWeb12306 web = new safeWeb12306();
		System.out.println(Thread.currentThread().getName());
		//�������
		new Thread(web,"����").start();
		new Thread(web,"��ũ").start();
		new Thread(web,"���").start();
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
		//ģ����ʱ
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//˯��200ms
		System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);			
	}
}