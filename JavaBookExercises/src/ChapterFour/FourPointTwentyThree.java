package ChapterFour;

import java.util.Scanner;

public class FourPointTwentyThree {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter employee name: ");
		String employee = scanner.nextLine();
		
		System.out.println("Enter number of hours worked in week:");
		int hours = scanner.nextInt();
		
		System.out.println("Enter employee's pay rate:");
		double rate = scanner.nextDouble();
		
		System.out.println("Enter federal tax withholding rate:");
		double federalTaxRate = scanner.nextDouble();
		
		System.out.println("Enter state tax withholding rate:");
		double stateTaxRate = scanner.nextDouble();
		
		double grossPay = rate * hours;
		double federalHolding = rate * hours * federalTaxRate;
		double stateHolding = rate * hours * stateTaxRate;
		double netPay = rate * hours - (federalHolding + stateHolding);
		
		System.out.println("Employee name: " + employee);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay Rate: " + rate);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("	Federal Withholding (" + (federalTaxRate * 100) + "%): " + federalHolding);
		System.out.println("	State Withholding (" + (stateTaxRate * 100) + "%): " + stateHolding);
		System.out.println("Net Pay: " + netPay);
		
	}

}
