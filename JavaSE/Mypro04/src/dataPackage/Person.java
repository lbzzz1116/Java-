package dataPackage;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("����"+age);
	}
	
	public static void main(String[] args) {
		Person t = new Person("����",23);
		t.display();
	}
}
