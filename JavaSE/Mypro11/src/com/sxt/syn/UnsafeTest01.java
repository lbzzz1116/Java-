package com.sxt.syn;
/*
 * �̲߳���ȫ�������и�������ͬ�����
 */
public class UnsafeTest01 {
	public static void main(String[] args) {
		//һ����Դ
		Web123061 web = new Web123061();
		System.out.println(Thread.currentThread().getName());
		//�������
		new Thread(web,"����").start();
		new Thread(web,"��ũ").start();
		new Thread(web,"���").start();
	}
}
class Web123061 implements Runnable{
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
			test();
		}
	}
	public void test() {
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