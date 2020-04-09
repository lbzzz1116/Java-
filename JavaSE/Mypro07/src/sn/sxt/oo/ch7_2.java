package sn.sxt.oo;
import java.util.Arrays;
import java.util.Scanner;
public class ch7_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入n的值：");
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
		System.out.println("原数组为："+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("排序后的数组为："+Arrays.toString(a));
		System.out.println("数组中最大的数为："+a[50-1]);
		System.out.println("数组中最小的数为："+a[0]);		
		System.out.println("数组中>=60的数有："+s+"个");			
	}
}