package ChapterFour;

import java.util.Scanner;

public class FourPointTwentySix {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a new amount. For example, 11.56: ");
		String amount = scanner.next();
		
		String cents = amount.substring(3);
		String dollars = amount.substring(0, amount.indexOf("."));
		
		//Find the number of one dollars
		int numberOfOneDollars = Integer.parseInt(dollars);
		int remainingAmount = Integer.parseInt(cents);
		
		//Find the number of quarters
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		
		//Find the number of dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		
		//Find the number of nickels
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		
		//Find the number of pennies
		int numberOfPennies = remainingAmount;
		
		
		System.out.println("Your amount " + amount + "consists of");
		System.out.println(" " + numberOfOneDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
	}

}
