
public class TestThis {
	int a, b, c;//成员变量
	
	TestThis(){
		System.out.println("正在初始化一个Hello对象");
	}
	TestThis(int a,int b){
		//TestThis();//这样是无法调用构造方法的!
		this();//调用无参的构造方法，并且必须位于第一行
		a = a;//这里都是局部变量
		this.a = a;
		this.b = b;
	}
    TestThis(int a, int b, int c) {
        this(a, b); // 调用带参的构造方法，并且必须位于第一行！调用构造器！！！
        this.c = c;
    }
    void sing() {
    }
    void eat() {
        this.sing(); // 调用本类中的sing();调用普通的方法
        System.out.println("你妈妈喊你回家吃饭！");
    }
 
    public static void main(String[] args) {
        TestThis hi = new TestThis(2, 3);
        hi.eat();
    }
	
}
