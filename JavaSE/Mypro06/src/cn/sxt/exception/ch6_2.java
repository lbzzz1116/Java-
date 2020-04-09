package cn.sxt.exception;
import java.util.*;
public class ch6_2 {
	public static void main(String[] args) throws Exception {
		Scanner num = new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a1 = num.nextInt();
		int a2 = num.nextInt();
		int a3 = num.nextInt();
		isTriangle(a1,a2,a3);
	}
		public static void isTriangle(int a,int b,int c) throws Exception {

			if(a+b<c||a+c<b||b+c<a) {	
					throw new Exception("a,b,c不能构成三角形");
			}else {
				System.out.println("三角形的三个边长为："+a+","+b+","+c);
			}
		}
}
