package com.sxt.syn;
/*
 * �̲߳���ȫ��ȡǮ
 */
public class SynTest02 {
	public static void main(String[] args) {
		//�˻�
		Account account = new Account(100, "������");
		SafeDrawing you = new SafeDrawing(account, 80, "�ɱ�����");
		SafeDrawing wife = new SafeDrawing(account, 90, "happy����");
		you.start();
		wife.start();
	}
}
//�˻�
class Account{
	int money;
	String name;
	public Account(int money, String name) {
		this.money = money;
		this.name = name;
	}
}
//ģ���������
class SafeDrawing extends Thread{
	Account account;//ȡǮ���˻�
	int drawingMoney;//ȡ��Ǯ��
	int packetTotal;//�ڴ���Ǯ
	
	public SafeDrawing(Account account, int drawingMoney,String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}
	
	@Override
	public void run() {
		test();
	}
	//Ŀ�겻������ʧ�ܣ����ﲻ������this ��Ӧ������account
	public synchronized void test() {
		if(account.money-drawingMoney<0) {
			return;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		account.money -= drawingMoney;
		packetTotal += drawingMoney;
		System.out.println(this.getName()+"-->�˻����Ϊ��"+account.money);
		System.out.println(this.getName()+"-->�ڴ���ǮΪ��"+packetTotal);
	}
	
}










