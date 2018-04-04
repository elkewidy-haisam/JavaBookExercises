package ChapterFive;

import java.util.Scanner;

public class FivePointFifty {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String. :");
		String string = scanner.nextLine();
		
		
		int length = string.length();
		
		int capitalsCount = 0;
		
		
		for (int i = 0; i < length; i++) {
			
			if (Character.isUpperCase(string.charAt(i))) {
				
				++capitalsCount;
				
			}
			
		}
		
		System.out.println("The number of uppercase letters is " + capitalsCount);
		
	}

}
