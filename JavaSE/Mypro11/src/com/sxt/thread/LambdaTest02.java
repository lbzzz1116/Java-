package com.sxt.thread;
/*
 * Lambda推导，加入参数
 */
public class LambdaTest02 {

	public static void main(String[] args) {
		ILove love = (int a)-> {
			System.out.println("i like lambda1 -->"+a);
		};
		love.lambda(100);
		
		//简化，类型可以省略，自动匹配
		love = (a)-> {
			System.out.println("i like lambda1 -->"+a);
		};
		love.lambda(50);
		
		//只有一个参数，括号也可以省略
		love = a -> {
			System.out.println("i like lambda1 -->"+a);
		};
		love.lambda(25);
		
		//只有一行代码。花括号也可以省略
		love = a -> System.out.println("i like lambda1 -->"+a);
		love.lambda(0);
	}
}
	
interface ILove{
	void lambda(int a);
}
//外部类
class Love implements ILove{
	public void lambda(int a) {
		System.out.println("i like lambda1 -->"+a);
	}	
}


