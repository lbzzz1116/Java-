package com.sxt.thread;
/*
 * Lambda�Ƶ����������
 */
public class LambdaTest03 {
	public static void main(String[] args) {
		new Thread(()->{
			for(int i =0;i<10;i++) {
			System.out.println("һ��ѧϰlambda");
			}
		}).start();
		
		new Thread(()->System.out.println("һ��ѧϰJava")).start();
	}
}
	


//�򵥶��߳�ʹ��lambda
//new Thread(()->{...������...}).start();