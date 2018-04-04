package ChapterFive;

import java.util.Scanner;

public class FivePointFortyNine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String.");
		String string = scanner.nextLine();
		
		int vowelsCount = 0;
		int consonantsCount = 0;
		
		
		int length = string.length();
		
		for (int i = 0; i < length; i++) {
			
			switch (string.charAt(i)) {
				
			case 'A': ++vowelsCount;
				break;
			case 'E': ++vowelsCount;
				break;
			case 'I': ++vowelsCount;
				break;
			case 'O': ++vowelsCount;
				break;
			case 'U': ++vowelsCount;
				break;
			case 'a': ++vowelsCount;
				break;
			case 'e': ++vowelsCount;
				break;
			case 'i': ++vowelsCount;
				break;
			case 'o': ++vowelsCount;
				break;
			case 'u': ++vowelsCount;
				break;
			case ' ': 
				break;
			case '.': 
				break;
			default: ++consonantsCount;
				break;
			
			}
			
		}
		
		System.out.println("Vowels count: " + vowelsCount);
		System.out.println("Consonants count: " + consonantsCount);
		
		
	}
	
	
	
}
