package ChapterTwo;

import java.util.Scanner;

public class TwoPointTwentyOne {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter investment amount, interest rate, and number of years.");
		
		int investmentAmount = scanner.nextInt();
		double interestRate = scanner.nextDouble();
		int years = scanner.nextInt();
		
		double futureInvestment = investmentAmount * Math.pow(1 + interestRate, years * 12);
		
		System.out.println("Future investment: " + futureInvestment);
		
		
	}

}
