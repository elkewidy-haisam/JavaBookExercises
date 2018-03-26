package ChapterTwo;

import java.util.Scanner;

public class TwoPointTwenty {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate:");
		
		int balance = scanner.nextInt();
		double rate = scanner.nextDouble();
		
		double interest = balance * (rate/1200);
		
		System.out.println(interest);
		
	}

}
