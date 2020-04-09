package cn.sxt.oop;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
    	System.out.println("请输入圆的半径");
    	Scanner scanner = new Scanner(System.in);
    	float radius = scanner.nextFloat();
    	Circle yuan = new Circle(radius);
    	yuan.show();
    	
    	System.out.println("请输入圆柱的高：");
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
	public double getPerimeter() {		//计算圆的周长
		double perimeter = (2 * Math.PI * this.radius);
		return perimeter;
	}
	public double getArea(float radius) {			//计算面积
		double area =  (Math.PI * Math.pow(radius, 2));
		return area;
	}
	public void show() {		//输出到屏幕
		System.out.println("圆的半径：" + this.radius + "\t" + "圆的面积是：" + this.getArea(this.radius) + "\t" + "圆的周长：" + this.getPerimeter());
	}
}
class Cylinder extends Circle{
	//私有属性
	private double high;
	public void setHigh(double high) {
		this.high = high;
	}
	//构造方法
	public Cylinder () {
	}
	//普通方法
	public double getVolume(float radius) {		//计算圆柱体积
		double volume = this.high * this.getArea(radius);		
		return volume;
	}
	public void showVolume(double result) {
		System.out.println("圆柱的体积是：" + result );
	}
}

