
public class TestThis {
	int a, b, c;//��Ա����
	
	TestThis(){
		System.out.println("���ڳ�ʼ��һ��Hello����");
	}
	TestThis(int a,int b){
		//TestThis();//�������޷����ù��췽����!
		this();//�����޲εĹ��췽�������ұ���λ�ڵ�һ��
		a = a;//���ﶼ�Ǿֲ�����
		this.a = a;
		this.b = b;
	}
    TestThis(int a, int b, int c) {
        this(a, b); // ���ô��εĹ��췽�������ұ���λ�ڵ�һ�У����ù�����������
        this.c = c;
    }
    void sing() {
    }
    void eat() {
        this.sing(); // ���ñ����е�sing();������ͨ�ķ���
        System.out.println("�����躰��ؼҳԷ���");
    }
 
    public static void main(String[] args) {
        TestThis hi = new TestThis(2, 3);
        hi.eat();
    }
	
}
