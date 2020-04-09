package cn.sxt.exception;
import java.util.*;
public class ch6_3 {
	public static void main(String[] args) throws IllegalMarkException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int n = scanner.nextInt();
        int s = 0;
        for(int i = 1;i <= n;i++) {
        	try {
        		System.out.println("请输入第"+i+"个学生的分数：");
        		int a = scanner.nextInt();
        		if(a<0) {
        			i--;
        			throw new IllegalMarkException("分数必须是正数或者0");
        		}
        		System.out.print("第"+i+"个学生的分数为："+a+"\n");
        		s = s+a;
        		}catch (IllegalMarkException e){
        			e.printStackTrace();				
        			}	
        	
        	}
			System.out.println(n+"个学生分数的平均分为："+s/n);		
		}
}
//自定义异常
class IllegalMarkException extends Exception{
	public IllegalMarkException() {
	}
	public IllegalMarkException(String msg) {
		super(msg);
	}
}

