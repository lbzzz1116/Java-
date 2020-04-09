package com.sxt.thread;
/*
 * Lambda�Ƶ����������
 */
public class LambdaTest02 {

	public static void main(String[] args) {
		ILove love = (int a)-> {
			System.out.println("i like lambda1 -->"+a);
		};
		love.lambda(100);
		
		//�򻯣����Ϳ���ʡ�ԣ��Զ�ƥ��
		love = (a)-> {
			System.out.println("i like lambda1 -->"+a);
		};
		love.lambda(50);
		
		//ֻ��һ������������Ҳ����ʡ��
		love = a -> {
			System.out.println("i like lambda1 -->"+a);
		};
		love.lambda(25);
		
		//ֻ��һ�д��롣������Ҳ����ʡ��
		love = a -> System.out.println("i like lambda1 -->"+a);
		love.lambda(0);
	}
}
	
interface ILove{
	void lambda(int a);
}
//�ⲿ��
class Love implements ILove{
	public void lambda(int a) {
		System.out.println("i like lambda1 -->"+a);
	}	
}


