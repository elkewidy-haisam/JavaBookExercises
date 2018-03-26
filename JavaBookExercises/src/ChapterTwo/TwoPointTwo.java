package ChapterTwo;

import java.util.Scanner;

public class TwoPointTwo {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius and length of a cylinder.");
		
		double radius = scanner.nextDouble();
		double length = scanner.nextInt();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("area: " + area);
		System.out.println("volume: " + volume);
	
	}
	

}
