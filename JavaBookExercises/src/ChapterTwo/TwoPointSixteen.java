package ChapterTwo;

import java.util.Scanner;

public class TwoPointSixteen {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the side of a hexagon.");
		int hexagon = scanner.nextInt();
		
		double area = (3 * Math.sqrt(3))/2 * Math.pow(hexagon, 2);
		
		System.out.println(area);
		
		
	}
	

}
