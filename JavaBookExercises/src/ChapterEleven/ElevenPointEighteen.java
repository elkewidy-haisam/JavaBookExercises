package ChapterEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class ElevenPointEighteen {


    public static ArrayList<Character> toCharacterArray(String s) {

        ArrayList<Character> characterArray = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) != ' ') {
                characterArray.add(s.charAt(i));
            }

        }

        return characterArray;

    }


    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string : ");

            String input = scanner.nextLine();

            ArrayList<Character> charArray = toCharacterArray(input);

            System.out.println("Displaying characters in the array.");

            for (int i = 0; i < charArray.size(); i++) {

                System.out.print(charArray.get(i) + " ");

            }

    }


}
