import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//Բ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		double r = scanner.nextDouble();
		System.out.println("��Բ�İ뾶Ϊ��R="+ r);
		double C = 2*3.14*r;
		System.out.println("��Բ���ܳ�Ϊ��C="+"2*3.14*"+r+"="+C);
		double S = 3.14*r*r;
		System.out.println("��Բ�����Ϊ��S=3.14*"+r+"*"+r+"="+S);
		
		//��������
		int deposit = 10000;
		int currentDeposit1 = (int)(Math.round((deposit) * (1 + 0.0035)));
		//System.out.println(currentDeposit1);
		int timeDeposit1 = (int)(Math.round((deposit) * (1 + 0.015)));
		int currentDeposit2 = (int)(Math.round((deposit) * (1 + 0.0035) * 2));
		int timeDeposit2 = (int)(Math.round((deposit) * (1 + 0.021) * 2));
		System.out.println("����" + deposit);
		System.out.println("����1�걾���ܼƣ�" + currentDeposit1);
		System.out.println("����1�걾���ܼƣ�" + timeDeposit1);
		System.out.println("����2�걾���ܼƣ�" + currentDeposit2);
		System.out.println("����2�걾���ܼƣ�" + timeDeposit2);

		//
		Scanner scanner01=new Scanner(System.in);
		System.out.println("������һ����λ��������");
		int a=scanner01.nextInt();
		int a1=((((a%1000)%100)%10)+5)%10;  //����%10��Ϊ�˻�ȡ��λ�����ĸ�λ
		int a2=((((a%1000)%100)/10)+5)%10;	//��ȡ��λ������ʮλ
		int a3=(((a%1000)/100)+5)%10;	//��ȡ��λ�����İ�λ
		int a4=((a/1000)+5)%10;	//��ȡ��λ������ǧλ
		System.out.println("���ܺ������Ϊ��"+a1+a2+a3+a4);
	
	}
}
