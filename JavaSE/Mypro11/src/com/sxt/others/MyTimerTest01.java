package com.sxt.others;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ������ȣ�Timer��TimerTask
 */
public class MyTimerTest01 {
	public static void main(String[] args) {
		Timer t1 = new Timer();//�����ʱ����
		//ִ�а���
        MyTask task1 = new MyTask();//��������
        t1.schedule(task1,3000);  //3���ִ�У�
        //t1.schedule(task1,5000,1000);//5���Ժ�ÿ��1��ִ��һ�Σ�
        //GregorianCalendar calendar1 = new GregorianCalendar(2010,0,5,14,36,57); 
        //t1.schedule(task1,calendar1.getTime()); //ָ��ʱ�䶨ʱִ�У� 
	}
}
//������
class MyTask extends TimerTask{//�Զ����߳���̳�TimerTask�ࣻ
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("����1:"+i);
		}
	}
}
