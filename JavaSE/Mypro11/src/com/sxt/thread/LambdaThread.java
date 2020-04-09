package com.sxt.thread;
/*
 *Lambda表达式 简化线程（用一次）的使用
 */
public class LambdaThread {
	//静态内部类
	static class Test implements Runnable{
		@Override
		public void run() {
			for(int i=0;i<20;i++) {
				System.out.println("一边听歌");
			}	
		}
	}
	public static void main(String[] args) {
		//new Thread(new Test()).start();
		//局部内部类，方法内部的
		class Test2 implements Runnable{
			@Override
			public void run() {
				for(int i=0;i<20;i++) {
					System.out.println("一边听歌");
				}	
			}
		}
		new Thread(new Test2()).start();
		
		//匿名内部类 必须借助接口或父类,接口不能实例化，需加花括号实现类
		new Thread(() ->{//->箭头函数，lambda表达式
				for(int i=0;i<20;i++) {
					System.out.println("一边听歌");
				}	
			}	
		).start();
		//jdk8简化
	}
}





