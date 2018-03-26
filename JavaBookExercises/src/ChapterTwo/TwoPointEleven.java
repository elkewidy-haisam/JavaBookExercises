package ChapterTwo;

import java.util.Scanner;

public class TwoPointEleven {
	
	private static int secondsPerBirth = 7;
	private static int secondsPerDeath = 13;
	private static int secondsPerImmigrant = 45;
	
	private static int currentPopulation = 312032486;
	
	private static int secondsPerYear = 365 * 24 * 60 * 60;
	
	private static int deathsPerYear = secondsPerYear/secondsPerDeath;
	private static int birthsPerYear = secondsPerYear/secondsPerBirth;
	private static int immigrantsPerYear = secondsPerYear/secondsPerImmigrant;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number of years to forecast population.");
		
		int years = scanner.nextInt();
		
		System.out.println("Year " + years + " Population: " + (currentPopulation + (birthsPerYear + immigrantsPerYear - deathsPerYear) * years));
		
		
	}

}
