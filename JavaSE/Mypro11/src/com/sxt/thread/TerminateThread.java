package com.sxt.thread;
/*
 * ��ֹ�߳�
 * 1���߳�����ִ�����--������
 * 2���ⲿ���棬--�����뱦ʯ
 * ��Ҫʹ��stop��destroy
 */
public class TerminateThread implements Runnable{
	//1\�����ʶ������߳����Ƿ��������
	private boolean flag = true;
	private String name;
	
	
	public TerminateThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		int i = 0;
		//2\������ʶ��true-->���У�false-->ֹͣ
		while(flag) {//����״̬
			System.out.println(name+"-->"+i++);
		}
	}
	//�����ṩ�����ı��ʶ
	public void terminate() {
		this.flag = false;
	}
	
	public static void main(String[] args) {
		TerminateThread tt = new TerminateThread("C��");
		new Thread(tt).start();//����������״̬
		
		for(int i=0;i<=99;i++) {
			if(i==88) {
				tt.terminate();//�̵߳���ֹ����ֹ״̬
				System.out.println("tt game over");
			}
			System.out.println("main-->"+i++);
		}
		
		
		
		
		
		
	}
	
	
}
