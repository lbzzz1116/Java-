import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//圆问题
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double r = scanner.nextDouble();
		System.out.println("该圆的半径为：R="+ r);
		double C = 2*3.14*r;
		System.out.println("该圆的周长为：C="+"2*3.14*"+r+"="+C);
		double S = 3.14*r*r;
		System.out.println("该圆的面积为：S=3.14*"+r+"*"+r+"="+S);
		
		//银行问题
		int deposit = 10000;
		int currentDeposit1 = (int)(Math.round((deposit) * (1 + 0.0035)));
		//System.out.println(currentDeposit1);
		int timeDeposit1 = (int)(Math.round((deposit) * (1 + 0.015)));
		int currentDeposit2 = (int)(Math.round((deposit) * (1 + 0.0035) * 2));
		int timeDeposit2 = (int)(Math.round((deposit) * (1 + 0.021) * 2));
		System.out.println("本金：" + deposit);
		System.out.println("活期1年本金总计：" + currentDeposit1);
		System.out.println("定期1年本金总计：" + timeDeposit1);
		System.out.println("活期2年本金总计：" + currentDeposit2);
		System.out.println("定期2年本金总计：" + timeDeposit2);

		//
		Scanner scanner01=new Scanner(System.in);
		System.out.println("请输入一个四位正整数：");
		int a=scanner01.nextInt();
		int a1=((((a%1000)%100)%10)+5)%10;  //最后的%10是为了获取四位整数的个位
		int a2=((((a%1000)%100)/10)+5)%10;	//获取四位整数的十位
		int a3=(((a%1000)/100)+5)%10;	//获取四位整数的百位
		int a4=((a/1000)+5)%10;	//获取四位整数的千位
		System.out.println("加密后的数字为："+a1+a2+a3+a4);
	
	}
}
