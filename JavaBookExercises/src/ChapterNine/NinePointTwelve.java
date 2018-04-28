package ChapterNine;

import java.util.Scanner;

public class NinePointTwelve {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinates of two points in the following manner: x1 y1 x2 y2 x3 y3 x4 y4");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        int a = y1 - y2;
        int b = x1 - x2;
        int c = y3 - y4;
        int d = x3 - x4;
        int e = (y1 - y2) * x1 - (x1 - x2) * y1;
        int f = (y3 - y4) * x3 - (x3 - x4) * y3;

        NinePointElevenLinearEquation linearEq = new NinePointElevenLinearEquation(a, b, c, d, e, f);

        System.out.println("Is the set of linear equations solvable? " + linearEq.isSolvable());
        System.out.println("The two points intersect at (" + linearEq.getX() + "," + linearEq.getY() + ")");

    }


}
