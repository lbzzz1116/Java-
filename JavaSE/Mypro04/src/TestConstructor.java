
public class TestConstructor {
	public static void main(String[] args) {
	Point p = new Point(3.0, 4.0);//p属于main方法        
	Point origin = new Point(0.0, 0.0);
	System.out.println(p.getDistance(origin));	
	}
}

class Point{
	double x, y;
	//构造方法，方法名必须跟类名保持一致
	public Point(double _x,double _y) {
		x = _x;
		y = _y;
	}
	//构造方法，方法名必须跟类名保持一致
	public double getDistance(Point p) {//p为getDistance方法
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}
