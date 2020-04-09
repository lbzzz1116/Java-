package com.sxt.others;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 任务调度：Timer和TimerTask
 */
public class MyTimerTest01 {
	public static void main(String[] args) {
		Timer t1 = new Timer();//定义计时器；
		//执行安排
        MyTask task1 = new MyTask();//定义任务；
        t1.schedule(task1,3000);  //3秒后执行；
        //t1.schedule(task1,5000,1000);//5秒以后每隔1秒执行一次！
        //GregorianCalendar calendar1 = new GregorianCalendar(2010,0,5,14,36,57); 
        //t1.schedule(task1,calendar1.getTime()); //指定时间定时执行； 
	}
}
//任务类
class MyTask extends TimerTask{//自定义线程类继承TimerTask类；
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("任务1:"+i);
		}
	}
}
