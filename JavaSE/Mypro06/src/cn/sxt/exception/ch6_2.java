package cn.sxt.exception;
import java.util.*;
public class ch6_2 {
	public static void main(String[] args) throws Exception {
		Scanner num = new Scanner(System.in);
		System.out.println("��������������");
		int a1 = num.nextInt();
		int a2 = num.nextInt();
		int a3 = num.nextInt();
		isTriangle(a1,a2,a3);
	}
		public static void isTriangle(int a,int b,int c) throws Exception {

			if(a+b<c||a+c<b||b+c<a) {	
					throw new Exception("a,b,c���ܹ���������");
			}else {
				System.out.println("�����ε������߳�Ϊ��"+a+","+b+","+c);
			}
		}
}
