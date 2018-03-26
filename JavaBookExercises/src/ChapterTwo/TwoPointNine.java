package ChapterTwo;

import java.util.Scanner;

public class TwoPointNine {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values for v0, v1, and t");
		
		double velocity1 = scanner.nextDouble();
		double velocity2 = scanner.nextDouble();
		double time = scanner.nextDouble();
		
		double acceleration = (velocity2 - velocity1)/time;
		
		System.out.println(acceleration);
		
	}

}
