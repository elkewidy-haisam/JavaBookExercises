package ChapterEight;

import java.util.Scanner;

public class EightPointThirtyFive {


    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        int[][] matrix = new int[rows][rows];

        System.out.println("Enter the matrix row by row: ");

        for (int i = 0; i < rows; i++) {

            for (int k = 0; k < rows; k++) {

                matrix[i][k] = scanner.nextInt();

            }

        }

        int[] largestBlock = findLargestBlock(matrix);

        System.out.println("The maximum square submatrix is at (" + largestBlock[0] + "," + largestBlock[1] + ") with size 3.");


    }

    public static int[] findLargestBlock(int[][] m) {

        int[] matrixCoordinates = new int[2];

        for (int i = 0; i < m.length - 2; i++) {

            for (int k = 0; k < m.length - 2; k++) {

                if (m[i][k] == 1 && m[i][k + 1] == 1 && m[i][k] == 1) {

                    ++i;

                    if (m[i][k] == 1 && m[i][k + 1] == 1 && m[i][k] == 1) {

                        ++i;

                        if (m[i][k] == 1 && m[i][k + 1] == 1 && m[i][k] == 1) {

                            matrixCoordinates[0] = i - 2;
                            matrixCoordinates[1] = k;

                        }
                    }
                }


            }

        }

        return matrixCoordinates;

    }




}
