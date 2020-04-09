package com.sxt.thread;
/*
 *创建线程方式一：
 *1、创建：继承Thread+重写run
 *2、启动：创建子类对象+start
 */

public class StartThread extends Thread{
	/*
	 * 线程入口
	 */
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("一边听歌");
		}
	}
	
	public static void main(String[] args) {
		//创建子类对象
		StartThread st = new StartThread();
		//启动
		st.start();//start开启一个新的线程交给CPU，两边不影响
		//不保证立即运行，由CPU调用，要注意调用start的时机
		for(int i=0;i<20;i++) {
			System.out.println("一边Coding");
		}
	}
}
