package project;

public class Square extends Rectangle{
	
	public static void main(String[] args) {
		Square s1 = new Square();
		System.out.println("Width:"+s1.getWidth());
		System.out.println("Area:"+s1.getArea());
		System.out.println(s1);
	}
	
	Square(double length, MyPoint point) {
		this.center = point;
		this.height = length;
		this.width = length;
	}
	
	Square() {
		this(1.0, new MyPoint(0.5,0.5));
	}
}
