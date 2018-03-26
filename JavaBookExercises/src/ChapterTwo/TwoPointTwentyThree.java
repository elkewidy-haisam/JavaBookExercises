package ChapterTwo;

import java.util.Scanner;

public class TwoPointTwentyThree {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter distance to drive, fuel efficiency, and price per gallon:");
		
		double distance = scanner.nextDouble();
		double efficiency = scanner.nextDouble();
		double ppg = scanner.nextDouble();
		
		double costOfTrip = distance * (1/efficiency) * ppg;
		
		System.out.println("Cost of trip: " + costOfTrip);
		
	}

}
