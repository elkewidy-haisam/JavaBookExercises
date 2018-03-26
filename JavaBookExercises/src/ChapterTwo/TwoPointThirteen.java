package ChapterTwo;

public class TwoPointThirteen {
	
	
	public static void main(String[] args) {
		
		int initialDeposit = 100;
		double monthlyInterest = .05/12;
		double compoundValue = 0;
		
		for (int i = 1; i <= 6; i++) {
			
			compoundValue = (initialDeposit + compoundValue) * (1 + monthlyInterest);
			System.out.println("Year " + i + "value: " + compoundValue);
			
		}
		
		
	}
	

}
