import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		//ʮ����ת������
		System.out.println("������һ��ʮ��������");
		Task methods = new Task();
		int temp1 = methods.decimalCoverBinal(1,0);
		System.out.println("�����ƽ��Ϊ��" + temp1);
		
		//���
		int temp2 = methods.totalNum();
		System.out.println("��1+��2+����+��100 = " + temp2);

		//3.��д�ݹ��㷨����һ�����Ĺ�������: 1��1��2��3��5��8��13��21��34...... �����еĵ�40λ���Ƕ��١�
		System.out.println("��40λ�����ǣ�" + methods.sequence(40));
		
	}
	
	int decimalCoverBinal(int i,int changeNum) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(;;) {
			if(num == 0) {
				break;
			}
			else {
				int remainNum = num % 2;
				num = num/2;
				changeNum += remainNum *i;
				i = i*10;
			}
		}
		return changeNum;
	}
	
	int totalNum() {
		int sum = 0;
		int i = 0;
		for(int j = 1;j <= 100;j++) {
			i = i + j;
			sum = sum + i; 
		}
		return sum;
	}
	
	int sequence(int num) {
		if(num ==1 || num == 2 ) {
			return 1;
		}else {
			return (sequence(num - 1) + sequence(num - 2));
		}
	}
	
	
	
}
