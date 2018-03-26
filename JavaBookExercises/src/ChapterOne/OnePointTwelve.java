package ChapterOne;

public class OnePointTwelve {
	
	private static double miles = 24;
	private static double hour = 1;
	private static double minutes = 40;
	private static double seconds = 35;
	
	private static double speed = miles/(hour + (minutes/60) + (seconds/60 * 60));
	
	public static void main(String[] args) {
		
		System.out.println(speed);
		
		
	}

}
