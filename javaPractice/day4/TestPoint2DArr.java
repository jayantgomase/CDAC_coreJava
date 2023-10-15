//package day4;
//
//import java.util.Scanner;
//
//import day2.Point2D;
//
//public class TestPoint2DArr {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.println("Enter no of boxes to make");
//		Point2D[] points=new Point2D[sc.nextInt()];
//		
//		for (int i = 0; i < points.length; i++) {
//			System.out.println("Enter value of x and y : ");
//			points[i] = new Point2D(sc.nextInt(), sc.nextInt( ));
//		}
//		
//		for(Point2D p : points) {
//			System.out.println(p.show());
//		}
//		
//		if(points[0].isEqual(points[1])) {
//			System.out.println("point 1 is equal to point 2");
//		}
//		else {
//			System.out.println("p1 is not equal to p2");
//			double distance = points[0].calculateDistance(points[1]);
//			System.out.println("distance between point 1 and point 2 is " + distance);
//		}
//		
//		
//		
//		
//		sc.close();
//	}
//}
