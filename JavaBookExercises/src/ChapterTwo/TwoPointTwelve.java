package ChapterTwo;

import java.util.Scanner;

public class TwoPointTwelve {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter velocity and acceleration:");
		
		double velocity = scanner.nextDouble();
		double acceleration = scanner.nextDouble();
		
		double length = Math.pow(velocity, 2)/acceleration;
		
		System.out.println("length: " + length);
		
	}
	
	

}
