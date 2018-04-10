package ChapterEight;

import java.util.Scanner;

public class EightPointThirtySix {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number n:");
        int n = scanner.nextInt();

        String[][] matrix = new String[n][n];

        System.out.println("Enter " + n + " rows of letters separated by spaces: ");

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {

                matrix[i][k] = scanner.next();

            }
        }

        if (isALatinSquare(matrix, n) == true) {

            System.out.println("The input array is a Latin square.");

        } else {

            System.out.println("The input array is not a Latin square.");

        }


    }

    public static boolean isALatinSquare(String[][] matrix, int n) {

        int[] letterCounters = new int[n];

        for (int i = 0; i < matrix.length; i++) {

            for (int k = 0; k < matrix[i].length - 1; k++) {

                if (matrix[i][k] == matrix[i][k+1]) {

                    ++letterCounters[i];

                }

            }

        }

        for (int k = 0; k < letterCounters.length; k++) {

            if (letterCounters[k] != 1) {

                return false;

            }

        }

        return true;

    }


}
