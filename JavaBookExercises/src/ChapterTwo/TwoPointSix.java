package ChapterTwo;

import java.util.Scanner;

public class TwoPointSix {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a digit between 1 and 1000 if you want to know the sum of its digits.");
		
		int number = scanner.nextInt();
		
		int digitOne = number/1000;
		number = number/1000;
		
		int digitTwo = number/100;
		number = number/100;
		
		int digitThree = number/10;
		number = number/10;
		
		int sum = digitOne + digitTwo + digitThree;
		
		System.out.println("sum: " + sum);
		
	}

}
