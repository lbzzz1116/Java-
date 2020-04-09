package com.sxt.state;

import java.lang.Thread.State;

/*
 * �۲��߳�״̬
 */
public class AllState {
	public static void main(String[] args) {
		Thread t = new Thread(()->{
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("......");
			}
		});
		//�۲�״̬
		State state = t.getState();
		System.out.println(state);//NEW
		
		t.start();
		state = t.getState();//RUNNABLE
		System.out.println(state);
		
		while(true) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			state = t.getState();//RUNNABLE
			System.out.println(state);
		}
	}
}
