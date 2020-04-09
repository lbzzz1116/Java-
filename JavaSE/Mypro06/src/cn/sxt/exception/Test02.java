package cn.sxt.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		FileReader reader = null;
        try {
			reader = new FileReader("d:/a.txt");
			char c1 = (char)reader.read();//默认int，要强转
			System.out.println(c1);
			System.out.println("step1");
		} catch (FileNotFoundException e) {//catch子类异常在前，父类异常在后
			// TODO Auto-generated catch block
			System.out.println("step2");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("step3");
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
