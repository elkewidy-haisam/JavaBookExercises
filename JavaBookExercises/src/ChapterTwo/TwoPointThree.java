package ChapterTwo;

import java.util.Scanner;

public class TwoPointThree {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number in feet.");
		
		int feet = scanner.nextInt();
		
		double meters = feet * .305;
		
		System.out.println("The number you entered in meters is: " + meters);

	}
}
