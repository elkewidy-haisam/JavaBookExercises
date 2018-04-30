package ChapterThirteen;

import java.util.Scanner;

public class ThirteenPointTwentyOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers for a parabola in standard form, i.e. (y = ax^2 + bx + c): ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int hUpper = -1 * b;
        int hLower = 2 * a;
        int kUpper = (int) (4 * a * c - Math.pow(b, 2));
        int kLower = 4 * a;

        System.out.println("h is " + hUpper + "/" + hLower + " k is " + kUpper + "/" + kLower);

    }

}
