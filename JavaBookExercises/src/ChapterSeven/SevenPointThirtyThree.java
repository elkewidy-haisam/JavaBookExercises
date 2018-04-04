package ChapterSeven;

import java.util.Scanner;

public class SevenPointThirtyThree {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		
		String[] yearAnimals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse","sheep"};
		
		System.out.println(yearAnimals[year%12]);
		
	}

}
