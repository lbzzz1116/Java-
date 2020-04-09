package dataPackage;

import java.lang.*;

public class Circle {
	double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void getArea() {
		System.out.println("���="+Math.PI*r*r);
	}
	
	public void getPerimeter() {
		System.out.println("�ܳ�="+2*Math.PI*r);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(4.0);
		c.getArea();
		c.getPerimeter();
	}
}
