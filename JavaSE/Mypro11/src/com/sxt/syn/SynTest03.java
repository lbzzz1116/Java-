package com.sxt.syn;
/*
 * synchronized
 * 1��ͬ������
 * 2��ͬ���飬Ŀ�����ȷ
 */
public class SynTest03 {
	public static void main(String[] args) {
		//�˻�
		AccountSyn account = new AccountSyn(1000, "������");
		SynDrawing you = new SynDrawing(account, 80, "�ɱ�����");
		SynDrawing wife = new SynDrawing(account, 90, "happy����");
		you.start();
		wife.start();
	}
}
//�˻�
class AccountSyn{
	int money;
	String name;
	public AccountSyn(int money, String name) {
		this.money = money;
		this.name = name;
	}
}
//ģ���������
class SynDrawing extends Thread{
	AccountSyn account;//ȡǮ���˻�
	int drawingMoney;//ȡ��Ǯ��
	int packetTotal;//�ڴ���Ǯ
	
	public SynDrawing(AccountSyn account, int drawingMoney,String name) {
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
		//�������
		if(account.money<=0) {
			return;
		}
		//Ŀ������account��ͬ����
		synchronized(account) {
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
	
}










