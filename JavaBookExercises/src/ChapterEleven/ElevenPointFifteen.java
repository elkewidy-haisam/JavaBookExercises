package ChapterEleven;

import java.util.Scanner;

public class ElevenPointFifteen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of points: ");
        int points = scanner.nextInt();

        //arrays for x and y coordinates of all the polygon points; area size is determined by input
        int[] polygonXCoordinates = new int[points];
        int[] polygonYCoordinates = new int[points];

        //sum of determinants
        double sum = 0;

        //polygon area; calculated at the end of the program
        double polygonArea = 0;

        //insert values into arrays for x and y coordinates
        for (int i = 0; i < points * 2; i++) {

            if (i % 2 == 0) {

                polygonXCoordinates[i] = scanner.nextInt();

            } else {

                polygonYCoordinates[i] = scanner.nextInt();

            }

        }

        //calculate sum between points on a determinant
        for (int i = 0; i < points; i++) {

            sum += (polygonXCoordinates[i] * polygonYCoordinates[i + 1]);

        }

        sum += (polygonXCoordinates[points - 1] * polygonYCoordinates[1]);
        polygonArea = 0.5 * sum;

        System.out.println("The convex polygon area is: " + polygonArea);


    }

}
