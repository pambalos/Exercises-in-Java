package project;

public class Rectangle {
	double width;
	double height;
	MyPoint center;
	double area;
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,20);
		System.out.println(r1);
		Rectangle r2 = new Rectangle();
		System.out.println(r2);
	}
	
	Rectangle(double x, double y) {
		this.width = x;
		this.height = y;
		this.area = this.height*this.width;
		this.center = new MyPoint(((this.width)/2),((this.height)/2));
	}
	
	Rectangle () {
		this(1.0,1.0);
	}
	
	double getWidth() {
		return this.width;
	}
	
	double getHeight() {
		return this.height;
	}
	
	MyPoint getCenter() {
		return this.center;
	}
	
	double getArea() {
		return this.width*this.height;
	}
	
	public String toString() {
		String info = "Height:"+ this.height + " Width:" + width + " Center:(" + center + ")" + " Area:" + area;
		return info;
	}
}
