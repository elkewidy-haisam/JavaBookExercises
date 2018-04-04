package ChapterSix;

import java.util.Scanner;

public class SixPointThirtyNine {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the coordinates for three points, separated by spaces. For example, 0 0 1 2 3 4 : ");
		
		int x0 = scanner.nextInt();
		int y0 = scanner.nextInt();
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		boolean left = leftOfTheLine(x0, y0, x1, y1, x2, y2);
		boolean sameLine = onTheSameLine(x0, y0, x1, y1, x2, y2);
		boolean lineSegment = onTheLineSegment(x0, y0, x1, y1, x2, y2);
		
		if (left == true) {
			
			System.out.println("(" + x2 + "," + y2 +") is on the left side of the line from (" + x0 + "," + x0 + ") to (" + x1 + "," + y1 + ").");
			
		} else if (sameLine = true) {
			
			System.out.println("(" + x2 + "," + y2 +") is on the same line from (" + x0 + "," + x0 + ") to (" + x1 + "," + y1 + ").");
			
			
		} else if (lineSegment = true) {
			
			System.out.println("(" + x2 + "," + y2 +") is on the line segment from (" + x0 + "," + x0 + ") to (" + x1 + "," + y1 + ").");
			
		}
	
		
	}
	
	
	
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		if((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
		
	}
	
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		if((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
		
	}
	
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		
		
		
		double crossProduct = (y2 - y0) * (x1 - x0) - (x2 * x0) * (y1 - y0);
		double dotProduct = (x2 - x0) * (x1 - x0) + (y2 - y0) * (y1 - y0);
		double squareRootOfDistance = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
		
		if (crossProduct != 0) {
			
			return false;
			
		} else if (dotProduct < 0) {
			
			return false;
			
		} else if (dotProduct > squareRootOfDistance) {
			
			return false;
			
		} else {
			
			return true;
			
		}
		
		
	}
	


}
