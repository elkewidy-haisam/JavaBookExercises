package ChapterTwo;

import java.util.Scanner;

public class TwoPointEight {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a timezone offset in GMT.");
		
		int offset = scanner.nextInt();
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHour = totalHours % 24 + offset;
		
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

	}
}
