package com.sxt.state;
/*
 * �ػ��̣߳�Ϊ�û��̷߳���ģ�JVMֹͣ���õȴ��ػ��߳�ִ�����
 * Ĭ�ϣ��û��̣߳�JVM�ȴ��û��߳�ִ����ϲŻ�ֹͣ
 */
public class DaemonTest {
	public static void main(String[] args) {
		God god = new God();
		You you = new You();
		Thread t = new Thread(god);
		t.setDaemon(true);//���û��̵߳���Ϊ�ػ�
		t.start();
		//new Thread(god).start();
		new Thread(you).start();
	}
}

class You implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=365*100;i++) {
			System.out.println("happy life...");
		}
		System.out.println("ooooooo");
	}
}

class God implements Runnable{
	@Override
	public void run() {
		System.out.println("bless you...");
	}
}
