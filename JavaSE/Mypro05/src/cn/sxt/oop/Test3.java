package cn.sxt.oop;

public class Test3 {
    public static void main(String[] args) {
    	Actor a = new Actor("���»�");
    	a.showMovie();
    	a.showTV();
    	a.singSong();
    }
}

class Actor implements Movie,TV,Song{	//�����ӿڵ�ʵ��		��Ա��
//���췽��
    public Actor(String name) {
    	System.out.println("��Һ�����" + name);
   }	
//��ͨ����
    public void showMovie() {
    	System.out.println("�����ݵ�Ӱ");
    }
    public void showTV() {
    	System.out.println("�����۵��Ӿ�");
    }
    public void singSong() {
    	System.out.println("�һᳪ��");
    }
}

interface Movie{
	public abstract void showMovie();
}

interface TV{
	public abstract void showTV();
}

interface Song{
	public abstract void singSong();
}