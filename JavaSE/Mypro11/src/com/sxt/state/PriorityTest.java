package com.sxt.state;
/*
 * 线程的优先级
 * 1-10
 */
public class PriorityTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "t1");
        Thread t2 = new Thread(new MyThread(), "t2");
        t1.setPriority(1);
        t2.setPriority(10);
        //设置优先级在启动前
        t1.start();
        t2.start();
    }
}
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

