package project;

public class MyPoint {
	private double x;
	private double y;
	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10,30.5);
		System.out.println(p1);
		System.out.println(p2);
	}
	
	MyPoint() {
		this(0.0 , 0.0);
	}
	
	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double getX() {
		return this.x;
	}
	
	double getY() {
		return this.y;
	}
	
	public String toString() {
		String info = "x:"+ this.x + " y:" + y;
		return info;
	}
}
