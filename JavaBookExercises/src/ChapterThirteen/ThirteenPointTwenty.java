package ChapterThirteen;

import java.util.Scanner;

public class ThirteenPointTwenty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers, can be integer or decimal: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double[] rootValues = roots(discriminantRoots(a, b, c), a, b, c);
        String[] complexRoots = complexRoots(discriminantRoots(a, b, c), a, b, c);

        if (discriminantRoots(a, b, c).equals("two") | discriminantRoots(a, b, c).equals("one"))
            System.out.println("The equation has " + discriminantRoots(a, b, c) + " roots " + rootValues[0] + " " + rootValues[1]);
        else
            System.out.println(discriminantRoots(a, b, c) + complexRoots[0] + " and " + complexRoots[1]);

    }

    public static String discriminantRoots(double a, double b, double c) {

        double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        return (discriminant > 0 ? "two" : (discriminant == 0.0 ? "one" : "The roots are "));

    }

    public static double[] roots(String discriminant, double a, double b, double c) {

        double[] roots = new double[2];

        double r1 = ((-1 * b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
        double r2 = ((-1 * b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);

        if (discriminant.equals("two")) {

            roots[0] = r1;
            roots[1] = r2;

        } else if (discriminant.equals("one")) {

            roots[0] = r1;

        } else {

            roots[0] = 0.0;
            roots[1] = 0.0;

        }

        return roots;

    }

    public static String[] complexRoots(String discriminant, double a, double b, double c) {

        String[] complexRoots = new String[2];
        Complex complex = new Complex(a, b);

        if (discriminant.equals("The roots are ")) {

            complexRoots[0] = Double.toString(complex.getRealPart()) + " + " + Double.toString(complex.getImaginaryPart()) + "i";
            complexRoots[1] = Double.toString(complex.getRealPart()) + " - " + Double.toString(complex.getImaginaryPart()) + "i";

        }

        return complexRoots;

    }

}
