package com.sxt.thread;
/*
 * ��̬����
 * �ӿڣ���ʵ��ɫ�������ɫ
 */
public class StaticProxy {
	public static void main(String[] args) {
		new WeddingCompany(new You()).happyMarry();
		//new Thread(�̶߳���).start();
	}
}

interface Marry{//�ӿ�
	void happyMarry();
}

class You implements Marry{
	public void happyMarry() {
		System.out.println("you and �϶���");
	}
}
//�����ɫ
class WeddingCompany implements Marry{
	//��ʵ��ɫ
	private Marry target;
	public WeddingCompany(Marry target) {
		this.target = target;
	}

	public void happyMarry() {
		ready();
		this.target.happyMarry();
		after();
	}
	
	private void ready(){
		System.out.println("�������ѡ�������");
	}
	private void after(){
		System.out.println("�����á�������");
	}
}




