package ChapterTwo;

import java.util.Scanner;

public class TwoPointSeven {
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number of minutes.");
		
		int minutes = scanner.nextInt();
		
		int hours = minutes/60;
		int days = hours/24;
		int years = days/365;
		
		System.out.println("The number of years you get from this is " + years + "years. Remaining minutes are " + minutes % (24 * 60 * 365));

	}
}
