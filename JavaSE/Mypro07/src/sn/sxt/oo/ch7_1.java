/**
 * ����һ������Ϊ10 ��һά�ַ������飬��ÿһ��Ԫ�ش��һ������;
 * Ȼ������ʱ������������һ�����ʣ������ж������Ƿ�������������.
 * ����������ʾʹ�ӡ����Yes�����������ʹ�ӡ����No��
 */

package sn.sxt.oo;
import java.util.Arrays;
import java.util.Scanner;
public class ch7_1 {
	public static void main(String[] args) {
		String[] str = new String[10];//���峤��Ϊ10�ַ�������
		for(int i = 0;i < 10;i++) {
			str[i] = "a" + i;
		}
		System.out.println(Arrays.toString(str));
		System.out.println("�������ַ���");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();			//��������ַ���
		isExist(str,str1);
		
	}
	
	public static void isExist(String[] str,String str1) {
		boolean flag = true;
		for(int i = 0;i < str.length;i++) {
			if(str[i].equals(str1)) {
				System.out.println("Yes");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("No");
		}
	}

}
