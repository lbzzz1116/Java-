import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		//十进制转二进制
		System.out.println("请输入一个十进制整数");
		Task methods = new Task();
		int temp1 = methods.decimalCoverBinal(1,0);
		System.out.println("二进制结果为：" + temp1);
		
		//求和
		int temp2 = methods.totalNum();
		System.out.println("∑1+∑2+……+∑100 = " + temp2);

		//3.编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
		System.out.println("第40位数字是：" + methods.sequence(40));
		
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
