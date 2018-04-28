package ChapterTen;

import java.util.Scanner;

public class TenPointTwentyFive {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string and regex: ");

        String string = scanner.next();
        String regex = scanner.next();

        String[] substrings = split(string, regex);

        for (int i = 0; i < substrings.length; i++) {

            System.out.println(substrings[i]);

        }

    }



    public static String[] split(String s, String regex) {

        String[] substrings = new String[10];
        StringBuilder alteredString = new StringBuilder(s);
        int i = 0;

        while (s.length() != 0) {

            if ( i % 2 == 0) {

                substrings[i] = alteredString.substring(0, alteredString.indexOf(regex));
                alteredString.delete(0, alteredString.indexOf(regex));

            } else {

                substrings[i] = regex;

            }

        }

        return substrings;

    }


}
