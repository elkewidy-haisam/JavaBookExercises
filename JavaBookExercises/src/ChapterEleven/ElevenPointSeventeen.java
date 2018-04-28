package ChapterEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class ElevenPointSeventeen {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer m: ");

        int input = scanner.nextInt();
        int number = input;
        int n = 1;

        ArrayList<Integer> factors = new ArrayList<>();
        ArrayList<Integer> occurrences = new ArrayList<>();

        //add factors into the ArrayList
        /*for (int i = 2; i < input; i++ ) {

            if (input % i == 0) {

                factors.add(i);
                input = input / i;

            }

        } */

        while(input > 1) {

            for (int i = 2; i < input; i++) {

                if (input % i == 0) {

                    factors.add(i);
                    input = input / i;

                }

            }

        }

        //count how many times each factor appears in the ArrayList
        for (int j = 0; j < factors.size(); j++) {

            int count = 0;

            for (int k = 1; k < factors.size(); k++) {

                if (factors.get(j).equals(factors.get(k))) {

                    count++;

                }

            }

            occurrences.add(count);
            count = 0;

        }

        //multiply all numbers that appear an odd amount of times by each other
        for (int m = 0; m <occurrences.size(); m++) {

            if (occurrences.get(m) % 2 != 0) {

                n *= factors.get(m);

            }

        }

        //display elements in factors and occurrences
        for (int l = 0; l < factors.size(); l++) {

            System.out.println("factors: " + factors.get(l));

        }

        for (int l = 0; l < occurrences.size(); l++) {

            System.out.println("occurrences: " + occurrences.get(l));

        }

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (number * n));



    }

}
