package ChapterFour;

import java.util.Random;

public class FourPointTwentyFive {
	
	
	public static void main(String[] args) {
		
		System.out.println("Generating random license plate number.");
		
		Random r = new Random();
		
		int valueOne = (int) (r.nextInt(9-0+1) * 1);
		int valueTwo = (int) (r.nextInt(9-0+1) * 1);
		int valueThree = (int) (r.nextInt(9-0+1) * 1);
		
		char letterOne = (char)(r.nextInt('Z' - 'A' + 1) + 'A');
		char letterTwo = (char)(r.nextInt('Z' - 'A' + 1) + 'A');
		char letterThree = (char)(r.nextInt('Z' - 'A' + 1) + 'A');
		char letterFour = (char)(r.nextInt('Z' - 'A' + 1) + 'A');
		
		System.out.println("Your license plate number is: " + valueOne + valueTwo + valueThree + letterOne + letterTwo + letterThree + letterFour);
		
	}

}
