package sn.sxt.oo;
import java.util.Arrays;
public class ch7_3 {
	public static void main(String[] args) {
    	int[] randomNum = new int[10];					//�������һ��������10��Ԫ�ص�int������
		for(int i = 0;i < randomNum.length;i++) {
			randomNum[i] = (int)(30 * Math.random());
		}
		
		//��ӡ������ɵ�����˳��
		System.out.println(Arrays.toString(randomNum));
		
		int temp = 0;
		for(int i = 0;i < randomNum.length / 2;i++) {		//Ԫ�ؽ����ķ���
			temp = randomNum[i];
			randomNum[i] = randomNum[randomNum.length - 1 - i];
			randomNum[randomNum.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(randomNum));		//��ӡԪ�ؽ����������
	}
}
