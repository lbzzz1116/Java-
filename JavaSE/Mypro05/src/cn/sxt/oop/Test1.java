package cn.sxt.oop;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
    	System.out.println("������Բ�İ뾶");
    	Scanner scanner = new Scanner(System.in);
    	float radius = scanner.nextFloat();
    	Circle yuan = new Circle(radius);
    	yuan.show();
    	
    	System.out.println("������Բ���ĸߣ�");
    	double high = scanner.nextDouble();
    	Cylinder zhu = new Cylinder();
    	zhu.setHigh(high);
    	double result = zhu.getVolume(yuan.getRadius());
    	zhu.showVolume(result);
    }
}

class Circle{
	private float radius;
	public float getRadius() {
		return radius;
	}
	public Circle() {	
	}
	public Circle(float radius) {
		this.radius = radius;
	}
	public double getPerimeter() {		//����Բ���ܳ�
		double perimeter = (2 * Math.PI * this.radius);
		return perimeter;
	}
	public double getArea(float radius) {			//�������
		double area =  (Math.PI * Math.pow(radius, 2));
		return area;
	}
	public void show() {		//�������Ļ
		System.out.println("Բ�İ뾶��" + this.radius + "\t" + "Բ������ǣ�" + this.getArea(this.radius) + "\t" + "Բ���ܳ���" + this.getPerimeter());
	}
}
class Cylinder extends Circle{
	//˽������
	private double high;
	public void setHigh(double high) {
		this.high = high;
	}
	//���췽��
	public Cylinder () {
	}
	//��ͨ����
	public double getVolume(float radius) {		//����Բ�����
		double volume = this.high * this.getArea(radius);		
		return volume;
	}
	public void showVolume(double result) {
		System.out.println("Բ��������ǣ�" + result );
	}
}

