package day2;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D(int a, int b) {
		x = a;
		y = b;
	}
	
	public String show() {
		return " x = " + x + " y = " + y;
	}
	
	public boolean isEqual(Point2D obj) {
		if (this.x == obj.x && this.y == obj.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double calculateDistance(Point2D obj) {
		double distance;
		distance = Math.sqrt((this.x - obj.x)*(this.x - obj.x) + (this.y - obj.y)*(this.y - obj.y));
		return distance;
	}
}

