package com.sxt.thread;
/*
 *创建线程方式二：
 *1、创建：继承Runnable+重写run
 *2、启动：创建实现类对象+thread类对象+start
 *
 *
 *推荐：避免单继承的局限性，优先使用接口
 *方便共享资源
 *
 */

public class StartRun implements Runnable{
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
//		//创建实现类对象
//		StartRun sr = new StartRun();
//		//创建代理类对象
//		Thread t = new Thread(sr);
//		//启动
//		t.start();//start开启一个新的线程交给CPU，两边不影响
//		//不保证立即运行，由CPU调用，要注意调用start的时机
		
		new Thread(new StartRun()).start();
		
		for(int i=0;i<20;i++) {
			System.out.println("一边Coding");
		}
	}
}
