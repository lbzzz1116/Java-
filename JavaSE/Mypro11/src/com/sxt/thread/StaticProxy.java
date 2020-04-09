package com.sxt.thread;
/*
 * 静态代理
 * 接口：真实角色、代理角色
 */
public class StaticProxy {
	public static void main(String[] args) {
		new WeddingCompany(new You()).happyMarry();
		//new Thread(线程对象).start();
	}
}

interface Marry{//接口
	void happyMarry();
}

class You implements Marry{
	public void happyMarry() {
		System.out.println("you and 嫦娥奔月");
	}
}
//代理角色
class WeddingCompany implements Marry{
	//真实角色
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
		System.out.println("布置猪窝。。。。");
	}
	private void after(){
		System.out.println("闹玉兔。。。。");
	}
}




