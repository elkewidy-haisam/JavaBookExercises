package ChapterFour;

import java.util.Scanner;

public class FourPointTwentyFour {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three cities:");
		
		String firstCity = scanner.next();
		String secondCity = scanner.next();
		String thirdCity = scanner.next();
		
		if (firstCity.compareTo(secondCity) < 0 && firstCity.compareTo(thirdCity) < 0) {
			
			if (secondCity.compareTo(thirdCity) < 0) {
				
				System.out.println("The cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity);
				
			} else {
				

				System.out.println("The cities in alphabetical order are " + firstCity + " " + thirdCity + " " + secondCity);
				
			}
			
		} else 	if (secondCity.compareTo(firstCity) < 0 && secondCity.compareTo(thirdCity) < 0) {
			
			if (firstCity.compareTo(thirdCity) < 0) {
				
				System.out.println("The cities in alphabetical order are " + secondCity + " " + firstCity + " " + thirdCity);
				
			} else {
				

				System.out.println("The cities in alphabetical order are " + secondCity + " " + thirdCity + " " + firstCity);
				
			}
		
		} else {
			
			if (secondCity.compareTo(firstCity) < 0) {
				
				System.out.println("The cities in alphabetical order are " + thirdCity + " " + secondCity + " " + thirdCity);
				
			} else {
				

				System.out.println("The cities in alphabetical order are " + thirdCity + " " + firstCity + " " + secondCity);
				
			}
		}
	}
}
