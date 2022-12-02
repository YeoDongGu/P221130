package book.p332;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
		Point p = new Point(5, 7);
		System.out.println(p3.getLocation());
		System.out.println(p.getLocation());
	}

}

class Point {
	int x, y;

	Point() {

	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
//		super(x, y);
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}
