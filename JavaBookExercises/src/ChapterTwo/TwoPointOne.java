package ChapterTwo;

import java.util.Scanner;

public class TwoPointOne {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a temperature in Celsius.");
		
		int celsius = scanner.nextInt();
		
		int fahrenheit = (9/5) * celsius + 32;
		
		System.out.println(fahrenheit);
		
		
	}

}
