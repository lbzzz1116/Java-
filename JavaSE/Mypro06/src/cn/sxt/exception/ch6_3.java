package cn.sxt.exception;
import java.util.*;
public class ch6_3 {
	public static void main(String[] args) throws IllegalMarkException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ѧ������:");
        int n = scanner.nextInt();
        int s = 0;
        for(int i = 1;i <= n;i++) {
        	try {
        		System.out.println("�������"+i+"��ѧ���ķ�����");
        		int a = scanner.nextInt();
        		if(a<0) {
        			i--;
        			throw new IllegalMarkException("������������������0");
        		}
        		System.out.print("��"+i+"��ѧ���ķ���Ϊ��"+a+"\n");
        		s = s+a;
        		}catch (IllegalMarkException e){
        			e.printStackTrace();				
        			}	
        	
        	}
			System.out.println(n+"��ѧ��������ƽ����Ϊ��"+s/n);		
		}
}
//�Զ����쳣
class IllegalMarkException extends Exception{
	public IllegalMarkException() {
	}
	public IllegalMarkException(String msg) {
		super(msg);
	}
}

