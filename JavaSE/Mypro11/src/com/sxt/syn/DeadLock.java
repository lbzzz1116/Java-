package com.sxt.syn;
/*
 * �����������ͬ����������໥���ͷ���Դ
 * �Ӷ��໥�ȴ���һ�㷢����ͬ���г��ж���������
 */
public class DeadLock {
	public static void main(String[] args) {
		Markup g1 = new Markup(0, "�Ű�֥");
		Markup g2 = new Markup(1, "����");
		g1.start();
		g2.start();
	}
}
//�ں�
class Lipstick{
	
}
//����
class Mirror{
	
}
//��ױ
class Markup extends Thread{
	static Lipstick lipstick = new Lipstick();
	static Mirror mirror = new Mirror();
	//ѡ��
	int choice;
	//����
	String girl;
	public Markup(int choice, String girl) {
		this.choice = choice;
		this.girl = girl;
	}
	@Override
	public void run() {
		//��ױ
		markup();
	}
	//�໥���жԷ��Ķ�����-->�����������
	private void markup() {
		if(choice==0) {
			synchronized(lipstick) {//��ÿں����
				System.out.println(this.girl+"Ϳ�ں�");
				//1�����ӵ�о��ӵ���
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				/*synchronized(mirror) {//��þ��ӵ���
					System.out.println(this.girl+"�վ���");
				}*/
			}
			synchronized(mirror) {//��þ��ӵ���
				System.out.println(this.girl+"�վ���");
			}
		}else {
			synchronized(mirror) {//��þ��ӵ���
				System.out.println(this.girl+"�վ���");
				//2�����ӵ�пں����
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				/*synchronized(lipstick) {//��ÿں����
					System.out.println(this.girl+"Ϳ�ں�");
				}*/
			}
			synchronized(lipstick) {//��ÿں����
				System.out.println(this.girl+"Ϳ�ں�");
			}
		} 
	}
}





