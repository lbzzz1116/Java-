
public class Test {
	public static void main(String[] args) {
		Student s = new Student("С��",172,"Java");
		s.rest();
		s.study();
		System.out.println(s instanceof Student);
		System.out.println(s instanceof Person);
		System.out.println(s instanceof Object);
		System.out.println(new Person() instanceof Student);
	}
}

class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("��Ϣ�ᣡ");
	}
}

class Student extends Person{
	String major;
	public void study() {
		System.out.println("��ѧϰ��");
	}
	public Student(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
		System.out.println("����"+name+'\n'+"���"+height+'\n'+"רҵ"+major);
	} 
}
