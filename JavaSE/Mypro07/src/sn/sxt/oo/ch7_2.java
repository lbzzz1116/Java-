package sn.sxt.oo;
import java.util.Arrays;
import java.util.Scanner;
public class ch7_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������n��ֵ��");
		int n = scanner.nextInt();
		int[] a = new int[50];
		int s = 0;
		for(int i = 0;i<50;i++) {
			int num = (int)(n*Math.random());
			a[i] = num;
			if(a[i]>=60){
				s++;
			}
		}
		System.out.println("ԭ����Ϊ��"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("����������Ϊ��"+Arrays.toString(a));
		System.out.println("������������Ϊ��"+a[50-1]);
		System.out.println("��������С����Ϊ��"+a[0]);		
		System.out.println("������>=60�����У�"+s+"��");			
	}
}