package ChapterSix;

import java.util.Scanner;

public class SixPointThirtyFive {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a value for side of pentagon: ");
		int side = scanner.nextInt();
		
		double pentagonArea = computeArea(side);
		
		System.out.println(pentagonArea);
		
	}
	
	public static double computeArea(int side) {
		
		double pentagonArea = (5 * Math.pow(side, 2))/(4 * Math.tan(Math.PI/5));
		
		return pentagonArea;
		
	}

}
