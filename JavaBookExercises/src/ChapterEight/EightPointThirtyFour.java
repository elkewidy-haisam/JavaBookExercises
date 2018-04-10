package ChapterEight;

import java.util.Scanner;

public class EightPointThirtyFour {


    public static void main(String[] args) {

        double[][] points = new double[6][2];

        int k = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of six points, followed by spaces:");

        points[0][0] = scanner.nextInt();
        points[0][1] = scanner.nextInt();

        points[1][0] = scanner.nextInt();
        points[1][1] = scanner.nextInt();

        points[2][0] = scanner.nextInt();
        points[2][1] = scanner.nextInt();

        points[3][0] = scanner.nextInt();
        points[3][1] = scanner.nextInt();

        points[4][0] = scanner.nextInt();
        points[4][1] = scanner.nextInt();

        points[5][0] = scanner.nextInt();
        points[5][1] = scanner.nextInt();

        double[] rightMostLowestPoint = getRightmostLowestPoint(points);

        System.out.println("The rightmost lowest point is (" + rightMostLowestPoint[0] +  "," + rightMostLowestPoint[1] + ")");


    }


    public static double[] getRightmostLowestPoint(double[][] points) {

        double[] rightMostLowest = new double[2];

        double min = 0.0;
        double[][] pointsWithLowestYCoordinate = new double[6][2];
        double max = 0.0;



        //take in a list of points

        //find lowest y coordinate
        for (int i = 0; i < points.length; i++) {

            if (points[i][1] < min) {

                min = points[i][1];

            }

            rightMostLowest[1] = min;
            System.out.println("min: " + min);

        }


        //find all points with lowest y coordinate
        for (int j = 0; j < points.length; j++) {

            int k = 0;

            if (points[j][1] == min) {

                pointsWithLowestYCoordinate[k][0] = points[j][0];
                pointsWithLowestYCoordinate[k][1] = points[j][1];
                ++k;

            }



        }

        //and if there are duplicates, greatest x coordinate
        for (int m = 0; m < pointsWithLowestYCoordinate.length; m++) {

            if (pointsWithLowestYCoordinate[m][0] > max) {

                max = pointsWithLowestYCoordinate[m][0];

            }

            rightMostLowest[0] = max;

        }

        return rightMostLowest;

    }

}
