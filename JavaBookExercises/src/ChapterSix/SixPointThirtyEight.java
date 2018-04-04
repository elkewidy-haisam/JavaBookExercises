package ChapterSix;

public class SixPointThirtyEight {
	
	public static void main(String[] args) {
		
		final int NUMBER_OF_CHARS = 100;
		final int NUMBER_OF_DIGITS = 100;
		
		final int CHARS_PER_LINE = 10;
		final int DIGITS_PER_LINE = 10;
		
		
		//Print random characters between 'a' and 'z', 10 chars per line
		for (int i = 0; i < NUMBER_OF_CHARS; i++) {
			
			char ch = getRandomUpperCaseLetter();
			
			if ((i + 1) % CHARS_PER_LINE == 0)
				System.out.println(ch);
			else
				System.out.print(ch);
			
		}
		
		System.out.println(" ");
		System.out.println(" ----------------- ");
		System.out.println(" ");
		
		//Print random integers between '0' and '9', 10 integers per line
				for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
					
					char ch = getRandomDigitCharacter();
					
					if ((i + 1) % CHARS_PER_LINE == 0)
						System.out.println(ch);
					else
						System.out.print(ch);
					
				}
		
	}
	
	public static char getRandomCharacter (char ch1, char ch2) {
		
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
		
	}
	
	public static char getRandomLowerCaseLetter() {
		
		return getRandomCharacter('a', 'z');
		
	}
	
	public static char getRandomUpperCaseLetter() {
		
		return getRandomCharacter('A', 'Z');
		
	}
	
	public static char getRandomDigitCharacter() {
		
		return getRandomCharacter('0', '9');
		
	}
	
	public static char getRandomCharacter() {
		
		return getRandomCharacter('\u0000', '\uFFFF');
				
	}
	
	

}
