package ChapterFive;

import java.util.Scanner;

public class FivePointFortySix {
	
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string and the program will reverse it. : ");
		String input = scanner.next();
		
		int length = input.length();
		
		char[] letters = new char[length];
		
		for (int i = 0; i <= length - 1; i ++) {
			
			letters[i] = input.charAt(i);
			
		}
		
		System.out.print("The string in reverse order is: ");
		
		for (int j = length - 1; j >= 0; j--) {
			
			System.out.print(letters[j]);
			
		}
		
		
	}

}
