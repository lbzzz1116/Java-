package com.sxt.thread;
/*
 *�����̷߳�ʽ����
 *1���������̳�Runnable+��дrun
 *2������������ʵ�������+thread�����+start
 *
 *
 *�Ƽ������ⵥ�̳еľ����ԣ�����ʹ�ýӿ�
 *���㹲����Դ
 *
 */

public class StartRun implements Runnable{
	/*
	 * �߳����
	 */
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("һ������");
		}
	}
	
	public static void main(String[] args) {
//		//����ʵ�������
//		StartRun sr = new StartRun();
//		//�������������
//		Thread t = new Thread(sr);
//		//����
//		t.start();//start����һ���µ��߳̽���CPU�����߲�Ӱ��
//		//����֤�������У���CPU���ã�Ҫע�����start��ʱ��
		
		new Thread(new StartRun()).start();
		
		for(int i=0;i<20;i++) {
			System.out.println("һ��Coding");
		}
	}
}
