/**
 * 定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词;
 * 然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词.
 * 包含这个单词就打印出“Yes”，不包含就打印出“No”
 */

package sn.sxt.oo;
import java.util.Arrays;
import java.util.Scanner;
public class ch7_1 {
	public static void main(String[] args) {
		String[] str = new String[10];//定义长度为10字符串数组
		for(int i = 0;i < 10;i++) {
			str[i] = "a" + i;
		}
		System.out.println(Arrays.toString(str));
		System.out.println("请输入字符串");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();			//所输入的字符串
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
