package rq222ah_assing3;

public class Point {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int i, int z) {
		x = i;
		y = z;
	}

	public String toString() {

		String str = "(" + x + "," + y + ")";

		return str;

	}

	public boolean isEqualTo(Point p) {
		if (p.x == x && p.y == y)
			return true;

		return false;
	}

	public double distanceTo(Point p) {

		double distance = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));

		return distance;

	}

	public void move(int i, int z) {
		x = x + i;
		y = y + z;

	}

	public void moveToXY(int i, int z) {
		x = i;
		y = z;

	}

}