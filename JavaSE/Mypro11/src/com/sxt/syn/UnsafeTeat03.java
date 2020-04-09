package com.sxt.syn;

import java.util.ArrayList;
import java.util.List;

/*
 * 线程不安全：操作容器
 * 对数据存在又改又读需要保证线程安全
 */
public class UnsafeTeat03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10000;i++) {
			new Thread(()->{
				list.add(Thread.currentThread().getName());
			}) .start();
		}
		System.out.println(list.size());
	}
}














