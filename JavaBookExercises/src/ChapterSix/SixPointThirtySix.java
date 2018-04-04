package ChapterSix;

import java.util.Scanner;

public class SixPointThirtySix {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a value for number of sides in polygon: ");
		int sides = scanner.nextInt();
		
		System.out.print("Enter a value for side length of polygon: ");
		double side = scanner.nextDouble();
		
		double pentagonArea = computeArea(sides, side);
		
		System.out.println(pentagonArea);
		
	}
	
	public static double computeArea(int sides, double side) {
		
		double pentagonArea = (sides * Math.pow(side, 2))/(4 * Math.tan(Math.PI/sides));
		
		return pentagonArea;
		
	}

}
