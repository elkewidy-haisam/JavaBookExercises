package ChapterFour;

import java.util.Scanner;

public class FourPointTwentyTwo {
	
	
	public static void main(String[] args) {
		
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the first string. Can be a word or a sentence. :");
	String firstString = scanner.nextLine();
	
	System.out.println("Enter the second string. Can be a word or a sentence. :");
	String secondString = scanner.nextLine();
	
	if (firstString.contains(secondString)) {
		
		System.out.println("The second string is a substring of the first string.");
		
	} else {
		
		System.out.println("The second string is not a substring of the first string.");
		
	}
	
	}
}
