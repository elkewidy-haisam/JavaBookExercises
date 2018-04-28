package ChapterTwelve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwelvePointThirty {

    static char[] letters = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static int[] occurences = new int[26];

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Lincoln.txt");

        Scanner input = new Scanner(file);

        while (input.hasNext()) {

            String line = input.nextLine();

            for (int j = 0; j < letters.length; j++) {

                occurences[j] = frequency(line, letters[j]);

            }

        }

        displayOccurrences();

    }


    public static int frequency(String line, char letter) {

        int counter = 0;

        for (int i = 0; i < line.length() - 1; i++) {

            if (line.charAt(i) == letter | Character.toUpperCase(line.charAt(i)) == letter) {

                ++counter;

            }

        }

        return counter;

    }

    public static void displayOccurrences() {

        for (int k = 0; k < letters.length; k++) {

            System.out.println("Number of " + letters[k] + "s: " + occurences[k]);

        }

    }



}
