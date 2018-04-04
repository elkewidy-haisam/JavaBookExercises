package ChapterSix;

import java.util.Scanner;

public class SixPointThirtySeven {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int number = scanner.nextInt();
		
		System.out.println("Enter width of String you want to adjust number to.");
		int width = scanner.nextInt();
		
		String newString = format(number, width);
		
		System.out.println(newString);
		
	}
	
	public static String format(int number, int width) {
		
		String stringWidth = Integer.toString(number);
		
		if (stringWidth.length() > width) {
			
			return stringWidth;
			
		} else {
			
			for (int i = stringWidth.length(); i < width; i++) {
				
				stringWidth = "0" + stringWidth;
				
			}
			
		}
		
		return stringWidth;
		
	}

}
