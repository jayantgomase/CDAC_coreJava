package day2;
import java.util.Scanner;

public class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values of x & y for p1 : ");
		Point2D p1 = new Point2D(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter values of x & y for p2 : ");
		Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());
		
		System.out.println("coordinates of p1 : " + p1.show());
		System.out.println("coordinates of p2 : " + p2.show());
		
		if(p1.isEqual(p2)) {
			System.out.println("p1 is equal to p2");
		}
		else {
			System.out.println("p1 is not equal to p2");
		}
		
		double distance = p1.calculateDistance(p2);
		System.out.println("distance between p1 and p2 is " + distance);
		
		
		sc.close();
			
	}
}
