package cn.sxt.exception;
import java.util.*;

public class ch6_1 {
	public static void main(String[] args) throws Throws {
		Scanner input = new Scanner(System.in);
		float grade = 0.0f;
		while(true) {
			 System.out.println("请输入分数:");
             grade = input.nextFloat();
             if(grade > 100 || grade <0)
                 throw new Throws();
         }
	}
}

class Throws extends  Exception{
    void gradeException(){
        System.out.printf("分数只能在0-100之间\n");
    }
}