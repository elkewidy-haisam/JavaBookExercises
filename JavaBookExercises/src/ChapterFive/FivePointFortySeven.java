package ChapterFive;

import java.util.Scanner;

public class FivePointFortySeven {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first twelve digits of an ISBN number from 0 to 9: ");
		
		int[] isbnDigits = new int[13];
		int digitThirteen = 0;
		int sumOfTwelveDigits = 0;
		
		
		
		for (int i = 0; i <= 12; i++) {
			
			isbnDigits[i] = scanner.nextInt();
			
		}
		
		scanner.close();
		
		System.out.print("Your ISBN-13 number is: ");
		
		for (int j = 0; j <= isbnDigits.length - 2; j++) {
			
			sumOfTwelveDigits = sumOfTwelveDigits + isbnDigits[j];
			digitThirteen = 10 - (sumOfTwelveDigits % 10);
			
		}
		
		if (digitThirteen == 10) {
			
			digitThirteen = 0;
			isbnDigits[12] = digitThirteen;
			
		} else {
			
			isbnDigits[12] = digitThirteen;
			
		}
		
		for (int k = 0; k < isbnDigits.length; k++) {
			
			System.out.print(isbnDigits[k]);
			
		}
		
	}

}
