package com.sxt.syn;
/*
 * �̰߳�ȫ
 */
public class SynTest05 {
	public static void main(String[] args) {
		//һ����Դ
		SynWeb12306 web = new SynWeb12306();
		System.out.println(Thread.currentThread().getName());
		//�������
		new Thread(web,"����").start();
		new Thread(web,"��ũ").start();
		new Thread(web,"���").start();
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
	//ͬ����
	public synchronized void test2() {
		synchronized (this) {
			if(ticketNums<=0) {
				flag = false;
				return;
			}
			if(ticketNums<=0) {//�������һ��Ʊ
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
	
	//�̰߳�ȫ ͬ��
	public synchronized void test1() {
		if(ticketNums<=0) {
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