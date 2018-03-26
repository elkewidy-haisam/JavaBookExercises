package ChapterTwo;

import java.util.Scanner;

public class TwoPointFourteen {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter weight in kilograms.");
		double kilograms = scanner.nextDouble();
		
		System.out.println("Enter height in meters.");
		double height = scanner.nextDouble();
		
		double BMI = kilograms/Math.pow(height, 2);
		
		System.out.println("Body mass index: " + BMI);
		
	}

}
