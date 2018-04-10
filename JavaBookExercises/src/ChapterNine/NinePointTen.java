package ChapterNine;

import java.util.Scanner;

public class NinePointTen {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three values for a, b, and c:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation quadEq = new QuadraticEquation(a, b, c);

        if (quadEq.getDiscriminant() > 0) {

            System.out.println( quadEq.getRoot1());
            System.out.println( quadEq.getRoot2() );

        } else if (quadEq.getDiscriminant() == 0) {

            System.out.println( quadEq.getRoot1() );

        } else {

            System.out.println("This equation has no roots.");

        }




    }


}

class QuadraticEquation {

    private double a;

    private double b;

    private double c;


    public QuadraticEquation(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {

        return Math.pow(b, 2) - 4 * a * c;

    }

    public double getRoot1() {

        if (getDiscriminant() < 0) {

            return 0;

        } else {

            return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);

        }

    }

    public double getRoot2() {

        if (getDiscriminant() < 0) {

            return 0;

        } else {

            return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);

        }

    }


}
