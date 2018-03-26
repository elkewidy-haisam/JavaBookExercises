package ChapterTwo;

import java.util.Scanner;

public class TwoPointTwentyTwo {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer amount for dollars and cents without decimals; for example 11.56 would be 1156: ");
		int amount = scanner.nextInt();
		
		int remainingAmount = amount % 100;
		
		int numberOfDollars = amount / 100;
		remainingAmount = remainingAmount % 100;
		
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		int numberOfPennies = remainingAmount;
		
		//Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
		
		
	}

}
