package com.sxt.state;
/*
 * join���ϲ��̣߳�����̣߳�
 */
public class BlockedJoin02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("�ְֺͶ������̵Ĺ���");
		new Thread(new Father()).start();
	}
}

class Father extends Thread{
	@Override
	public void run() {
		System.out.println("����̣�����û��");
		System.out.println("�ö���ȥ���л�");
		Thread t = new Thread(new Son());
		t.start();
		try {
			t.join();//father������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����߶��ˣ��ϰֳ�ȥ�Һ���");
		}
		System.out.println("�ϰֽӹ��̣�����Ǯ���˶���");
	}
}

class Son extends Thread{
	@Override
	public void run() {
		System.out.println("����ϰֵ�Ǯ��ȥ��");
		System.out.println("·���и���Ϸ��������10��");
		for(int i=0;i<10;i++) {
			System.out.println(i+"���ȥ��...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�Ͻ�����ȥ������");
		System.out.println("����һ���л��ؼҡ�����");
	}
}



