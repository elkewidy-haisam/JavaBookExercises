package ChapterTwo;

import java.util.Scanner;

public class TwoPointSeventeen {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58 F and 41 F");
		double temp = scanner.nextDouble();
		
		System.out.println("Enter the wind speed in miles per hour.");
		int mph = scanner.nextInt();
		
		double windIndex = 35.74 + .6215*temp - 35.75*Math.pow(mph, .16) + .4275 * temp * Math.pow(mph, 0.16);
		
		System.out.println("The wind index is " + windIndex);
		
	}

}
