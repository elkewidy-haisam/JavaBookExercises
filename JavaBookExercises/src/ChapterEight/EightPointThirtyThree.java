package ChapterEight;

import java.util.Scanner;

public class EightPointThirtyThree {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of four vertices, with spaces in between them. For example, 0 0 1 1 2 2 3 3:");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        double x_mid1 = (x2 + x4)/2;
        double y_mid1 = (y2 + y4)/2;

        double x_mid2 = (x1 + x3)/2;
        double y_mid2 = (y1 + y3)/2;

        double slope1 = (y3 - y1)/(x3 - x1);
        double slope2 = (y4 - y2)/(x4 - x2);



    }



}