package ChapterFive;

import java.util.Scanner;

public class FivePointFortyEight {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string and the program will display letters in odd positions. : ");
		String input = scanner.next();
		
		int length = input.length();
		
		char[] letters = new char[length];
		
		for (int i = 0; i <= length - 1; i ++) {
			
			letters[i] = input.charAt(i);
			
		}
		
		System.out.print("The odd-positioned letters are: ");
		
		for (int j = 1; j < letters.length; j++) {
			
			System.out.print(letters[j]);
			j++;
			
		}
		
	}

}
