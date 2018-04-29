package ChapterThirteen;

public class Complex implements Cloneable, Comparable<Complex> {

    private double a;
    private double b;

    public Complex() {

        this.a = 0;

    }

    public Complex(double a) {

        this.a = a;
        this.b = 0;

    }

    public Complex(double a, double b) {

        this.a = a;
        this.b = b;


    }

    public String add(Complex firstComplex, Complex secondComplex) {

        return "(" + firstComplex.getRealPart() + " + " + firstComplex.getImaginaryPart() + "i) + (" + secondComplex.getRealPart() + " + " + secondComplex.getImaginaryPart() + "i) = " + (firstComplex.getRealPart() + secondComplex.getRealPart()) + " + " + (firstComplex.getImaginaryPart() + secondComplex.getImaginaryPart()) + "i";

    }

    public String subtract(Complex firstComplex, Complex secondComplex) {

        return "(" + firstComplex.getRealPart() + " + " + firstComplex.getImaginaryPart() + "i) - (" + secondComplex.getRealPart() + " + " + secondComplex.getImaginaryPart() + "i) = " + (firstComplex.getRealPart() - secondComplex.getRealPart()) + " + " + (firstComplex.getImaginaryPart() - secondComplex.getImaginaryPart()) + "i";

    }

    public String multiply(Complex firstComplex, Complex secondComplex) {

        return "(" + firstComplex.getRealPart() + " + " + firstComplex.getImaginaryPart() + "i) * (" + secondComplex.getRealPart() + " + " + secondComplex.getImaginaryPart() + "i) = " + (firstComplex.getRealPart() * secondComplex.getRealPart()) + " + " + (firstComplex.getImaginaryPart() * secondComplex.getImaginaryPart()) + "i";


    }

    public String divide(Complex firstComplex, Complex secondComplex) {

        return "(" + firstComplex.getRealPart() + " + " + firstComplex.getImaginaryPart() + "i) / (" + secondComplex.getRealPart() + " + " + secondComplex.getImaginaryPart() + "i) = " + (firstComplex.getRealPart() / secondComplex.getRealPart()) + " + " + (firstComplex.getImaginaryPart() / secondComplex.getImaginaryPart()) + "i";


    }

    public double abs() {

        double determinant = Math.pow(getRealPart(), 2) + Math.pow(getImaginaryPart(), 2);
        return Math.sqrt(determinant);

    }

    public double getRealPart() {

        return a;

    }

    public double getImaginaryPart() {

        return b;

    }


    @Override
    public int compareTo(Complex firstComplex) {

        if (abs() > firstComplex.abs())
            return 1;
        else if (abs() < firstComplex.abs())
            return -1;
        else
            return 0;

    }

    @Override
    public String toString() {

        if ( b == 0)
            return Double.toString(a);
        else
            return "(" + a + "+" + b + "i)";

    }

    @Override
    public Object clone() {

        try {

            return super.clone();

        }
        catch (CloneNotSupportedException ex) {

            return null;

        }

    }


}
