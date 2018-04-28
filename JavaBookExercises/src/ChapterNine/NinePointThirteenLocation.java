package ChapterNine;

import java.util.Scanner;

public class NinePointThirteenLocation {

    public int row, column;
    public double maxValue;


    public static NinePointThirteenLocation locateLargest(double[][] a) {

        NinePointThirteenLocation location = new NinePointThirteenLocation();

        location.maxValue = 0;
        location.row = 0;
        location.column = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] > location.maxValue) {

                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;

                }

            }


        }

        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + "," + location.column + ")");

        return location;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");

        int row = scanner.nextInt();
        int column = scanner.nextInt();

        double[][] a = new double[row][column];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                a[i][j] = scanner.nextDouble();

            }

        }

        NinePointThirteenLocation location = NinePointThirteenLocation.locateLargest(a);


    }

}
