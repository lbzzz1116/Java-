package com.sxt.syn;

import java.util.ArrayList;
import java.util.List;

/*
 * 线程不安全：操作容器
 * 对数据存在又改又读需要保证线程安全
 */
public class SynTest04 {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10000;i++) {//多线程
			new Thread(()->{
				synchronized (list) {
					list.add(Thread.currentThread().getName());
				}
			}) .start();
		}
		Thread.sleep(5000);//主线程需等待其余线程完成再操作
		System.out.println(list.size());//主线程
	}
}














