package ChapterTwo;

import java.util.Scanner;

public class TwoPointFifteen {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1: ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.println("Enter x2 and y2: ");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		double distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("Distance between the two points is: " + distance);

	}
}
