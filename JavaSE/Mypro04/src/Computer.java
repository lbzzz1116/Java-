
class SxtStu{
	String brand;
}

public class Computer {
	//���ԣ���Ա������
	int id;//
	String name;
	int age;
	SxtStu comp;//��һ����SxtStu�Ķ���
	//����
	void study() {
		System.out.println("������ѧϰ��ʹ�����ǵĵ��ԣ�"+comp.brand);
	}
	//���췽�����ô��������Ķ��󣬿���ϵͳ�Զ�����
	Computer(){
	}
	//����ִ�е���ڱ���Ҫ��
	public static void main(String[] args) {
		Computer stu1 = new Computer();
		stu1.id = 10001;
		stu1.age = 23;
		stu1.name = "����";
		
		SxtStu comp1 = new SxtStu();
		comp1.brand = "����";
		
		stu1.comp = comp1;
		stu1.study();		
	}
}
