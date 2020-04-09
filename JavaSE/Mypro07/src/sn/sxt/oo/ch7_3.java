package sn.sxt.oo;
import java.util.Arrays;
public class ch7_3 {
	public static void main(String[] args) {
    	int[] randomNum = new int[10];					//随机生成一个·包含10个元素的int类数组
		for(int i = 0;i < randomNum.length;i++) {
			randomNum[i] = (int)(30 * Math.random());
		}
		
		//打印随机生成的数组顺序
		System.out.println(Arrays.toString(randomNum));
		
		int temp = 0;
		for(int i = 0;i < randomNum.length / 2;i++) {		//元素交换的方法
			temp = randomNum[i];
			randomNum[i] = randomNum[randomNum.length - 1 - i];
			randomNum[randomNum.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(randomNum));		//打印元素交换后的数组
	}
}
