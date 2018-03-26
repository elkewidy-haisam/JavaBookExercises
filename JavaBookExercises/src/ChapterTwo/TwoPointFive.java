package ChapterTwo;

import java.util.Scanner;

public class TwoPointFive {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a subtotal and gratuity rate.");
		
		int subtotal = scanner.nextInt();
		int gratuity = scanner.nextInt();
		
		int gratuityValue = gratuity/100 * subtotal;
		int totalValue = subtotal + gratuityValue;
		
		System.out.println(gratuityValue);
		System.out.println(totalValue);
		
		
	}

}
