package ChapterTwo;

import java.util.Scanner;

public class TwoPointNineteen {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three points and coordinates, separated by spaces. So x1 y1 x2 y2 x3 y3.");
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		int x3 = scanner.nextInt();
		int y3 = scanner.nextInt();
		
		
		
		double side1 = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
		double side2 = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
		double side3 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
		
		double s = .5 * (side1 + side2 + side3);
		
		double area = Math.sqrt(s * (s - side1)*(s - side2)*(s - side3));
		
		System.out.println("Triangle area: " + area);
		
	}

}
