package ChapterTwo;

import java.util.Scanner;

public class TwoPointTen {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter mass of water in kilograms: ");
		double mass = scanner.nextDouble();
		
		System.out.println("Enter initial temperature:");
		double initTemp = scanner.nextDouble();
		
		System.out.println("Enter final temperature:" );
		double finalTemp = scanner.nextDouble();
		
		double Q = mass * (finalTemp - initTemp) * 4184;
		
		System.out.println("Energy needed to heat water is: " + Q + " joules.");
		
	}
	

}
