package com.sxt.cooperation;
/*
 * Э��ģ�ͣ�������������ʵ�ַ�ʽ���̷ܳ�
 * ����������
 */
public class CoTest01 {
	public static void main(String[] args) {
		SynContainer container = new SynContainer();
		new Productor(container).start();
		new Consumer(container).start();
	}
}
//������
class Productor extends Thread{
	SynContainer container;
	public Productor(SynContainer container) {
		this.container = container;
	}
	public void run() {
		//����
		for(int i=0;i<100;i++) {
			System.out.println("����-->"+i+"����ͷ");
			container.push(new Steamedbun(i));
		}
	}
}
//������
class Consumer extends Thread{
	SynContainer container;
	public Consumer(SynContainer container) {
		this.container = container;
	}
	public void run() {
		//����
		for(int i=0;i<100;i++) {
			System.out.println("����-->"+container.pop().id+"����ͷ");
			container.push(new Steamedbun(i));
		}
	}
}
//������
class SynContainer{
	Steamedbun[] buns = new Steamedbun[100];//�洢����
	int count = 0;//������
	//�洢����
	public synchronized void push(Steamedbun bun) {
		//��ʱ������ �������ڿռ�
		//�������� ֻ�еȴ�
		if(count==buns.length) {
			try {
				this.wait();//�߳����� ������֪ͨ�����������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//���ڿռ��������
		buns[count] = bun;
		count++;
		//�������ݿ���֪ͨ����
		this.notifyAll();
	}
	//��ȡ����
	public synchronized Steamedbun pop() {
		//��ʱ���� �������Ƿ��������
		//û������ֻ�еȴ�
		if(count==0) {
			try {
				this.wait();//�߳����� ������֪ͨ���ѽ������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//�������ݿ�������
		count--;//�����һ����ʼȡ
		Steamedbun bun = buns[count];
		//���ڿռ���Ի��ѶԷ�����
		this.notifyAll();
		return bun;
	}
}
//����ͷ
class Steamedbun{
	int id;
	public Steamedbun(int id) {
		this.id = id;
	}
	
}