package studio7;

public class Rectangle {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1,2);
		Rectangle r2 = new Rectangle(2,3);
	
		System.out.println(r1.Area());
		System.out.println(r1.perimeter());
		System.out.println(r1.isSquare());
		System.out.println(r1.isSmallerThan(r2));
		System.out.println(r1.isSmallerThan(r1));
	}
	
	private int length;
	private int width;
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int Area() {
		return length * width;
	}
	
	public int perimeter() {
		return (2 * length) + (2 * width);
	}
	
	public boolean isSquare() {
		if (width == length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmallerThan(Rectangle r2) {
		if (r2.Area() > this.Area()) {
			return true;
		}
		else {
			return false;
		}
	}
}
