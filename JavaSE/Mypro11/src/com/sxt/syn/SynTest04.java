package com.sxt.syn;

import java.util.ArrayList;
import java.util.List;

/*
 * �̲߳���ȫ����������
 * �����ݴ����ָ��ֶ���Ҫ��֤�̰߳�ȫ
 */
public class SynTest04 {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10000;i++) {//���߳�
			new Thread(()->{
				synchronized (list) {
					list.add(Thread.currentThread().getName());
				}
			}) .start();
		}
		Thread.sleep(5000);//���߳���ȴ������߳�����ٲ���
		System.out.println(list.size());//���߳�
	}
}














