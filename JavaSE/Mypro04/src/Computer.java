
class SxtStu{
	String brand;
}

public class Computer {
	//属性（成员变量）
	int id;//
	String name;
	int age;
	SxtStu comp;//另一个类SxtStu的对象
	//方法
	void study() {
		System.out.println("我正在学习！使用我们的电脑，"+comp.brand);
	}
	//构造方法，用创建这个类的对象，可由系统自动创建
	Computer(){
	}
	//程序执行的入口必须要有
	public static void main(String[] args) {
		Computer stu1 = new Computer();
		stu1.id = 10001;
		stu1.age = 23;
		stu1.name = "张三";
		
		SxtStu comp1 = new SxtStu();
		comp1.brand = "戴尔";
		
		stu1.comp = comp1;
		stu1.study();		
	}
}
