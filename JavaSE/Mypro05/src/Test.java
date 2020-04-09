
public class Test {
	public static void main(String[] args) {
		Student s = new Student("小刘",172,"Java");
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
		System.out.println("休息会！");
	}
}

class Student extends Person{
	String major;
	public void study() {
		System.out.println("在学习！");
	}
	public Student(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
		System.out.println("姓名"+name+'\n'+"身高"+height+'\n'+"专业"+major);
	} 
}
