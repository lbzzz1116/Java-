package com.sxt.thread;
/*
 *Lambda���ʽ ���̣߳���һ�Σ���ʹ��
 */
public class LambdaThread {
	//��̬�ڲ���
	static class Test implements Runnable{
		@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("һ������");
			}	
		}
	}
	public static void main(String[] args) {
		//new Thread(new Test()).start();
		//�ֲ��ڲ��࣬�����ڲ���
		class Test2 implements Runnable{
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("һ������");
				}	
			}
		}
		new Thread(new Test2()).start();
		
		//�����ڲ��� ��������ӿڻ���,�ӿڲ���ʵ��������ӻ�����ʵ����
		new Thread(() ->{//->��ͷ������lambda���ʽ
				for(int i=0;i<20;i++) {
					System.out.println("һ������");
				}	
			}	
		).start();
		//jdk8��
	}
}





