package ChapterOne;

public class OnePointEleven {
	
	private static int secondsPerBirth = 7;
	private static int secondsPerDeath = 13;
	private static int secondsPerImmigrant = 45;
	
	private static int currentPopulation = 312032486;
	
	private static int secondsPerYear = 365 * 24 * 60 * 60;
	
	private static int deathsPerYear = secondsPerYear/secondsPerDeath;
	private static int birthsPerYear = secondsPerYear/secondsPerBirth;
	private static int immigrantsPerYear = secondsPerYear/secondsPerImmigrant;
	
	public static void main(String[] args) {
		
		System.out.println("Year One Population: " + (currentPopulation + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 1));
		System.out.println("Year Two Population: " + (currentPopulation + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 2));
		System.out.println("Year Three Population: " + (currentPopulation + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 3));
		System.out.println("Year Four Population: " + (currentPopulation + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 4));
		System.out.println("Year Five Population: " + (currentPopulation + (birthsPerYear + immigrantsPerYear - deathsPerYear) * 5));
		
	}
	

}
