package com.sxt.syn;
/*
 * synchronized
 * 1、同步方法
 * 2、同步块，目标更明确
 */
public class SynTest03 {
	public static void main(String[] args) {
		//账户
		AccountSyn account = new AccountSyn(1000, "结婚礼金");
		SynDrawing you = new SynDrawing(account, 80, "可悲的你");
		SynDrawing wife = new SynDrawing(account, 90, "happy的她");
		you.start();
		wife.start();
	}
}
//账户
class AccountSyn{
	int money;
	String name;
	public AccountSyn(int money, String name) {
		this.money = money;
		this.name = name;
	}
}
//模拟提款机提款
class SynDrawing extends Thread{
	AccountSyn account;//取钱的账户
	int drawingMoney;//取的钱数
	int packetTotal;//口袋的钱
	
	public SynDrawing(AccountSyn account, int drawingMoney,String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}
	
	@Override
	public void run() {
		test();
	}
	//目标不对锁定失败，这里不是锁定this ，应该锁定account
	public synchronized void test() {
		//提高性能
		if(account.money<=0) {
			return;
		}
		//目标锁定account，同步块
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
			System.out.println(this.getName()+"-->账户余额为："+account.money);
			System.out.println(this.getName()+"-->口袋的钱为："+packetTotal);
		}
	}
	
}










