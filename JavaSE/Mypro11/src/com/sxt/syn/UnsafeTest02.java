package com.sxt.syn;
/*
 * �̲߳���ȫ��ȡǮ
 */
public class UnsafeTest02 {
	public static void main(String[] args) {
		//�˻�
		Account01 account = new Account01(100, "������");
		Drawing you = new Drawing(account, 80, "�ɱ�����");
		Drawing wife = new Drawing(account, 90, "happy����");
		you.start();
		wife.start();
	}
}
//�˻�
class Account01{
	int money;
	String name;
	public Account01(int money, String name) {
		this.money = money;
		this.name = name;
	}
}
//ģ���������
class Drawing extends Thread{
	Account01 account;//ȡǮ���˻�
	int drawingMoney;//ȡ��Ǯ��
	int packetTotal;//�ڴ���Ǯ
	
	public Drawing(Account01 account, int drawingMoney,String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}
	
	@Override
	public void run() {
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










