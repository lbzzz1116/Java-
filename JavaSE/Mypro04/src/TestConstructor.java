
public class TestConstructor {
	public static void main(String[] args) {
	Point p = new Point(3.0, 4.0);//p����main����        
	Point origin = new Point(0.0, 0.0);
	System.out.println(p.getDistance(origin));	
	}
}

class Point{
	double x, y;
	//���췽�����������������������һ��
	public Point(double _x,double _y) {
		x = _x;
		y = _y;
	}
	//���췽�����������������������һ��
	public double getDistance(Point p) {//pΪgetDistance����
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}