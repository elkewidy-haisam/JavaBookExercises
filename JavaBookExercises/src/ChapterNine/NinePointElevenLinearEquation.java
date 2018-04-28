package ChapterNine;

public class NinePointElevenLinearEquation {

    private int a, b, c, d, e, f;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public NinePointElevenLinearEquation(int a, int b, int c, int d, int e, int f) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    public boolean isSolvable() {

        if ((a * d) - (b * c) != 0) {

            return true;

        } else {

            return false;

        }

    }

    public int getX() {

        return ((e * d) - (b * f))/((a * d) - (b * c));

    }

    public int getY() {

        return ((a * f) - (e * c))/((a * d) - (b * c));

    }


}
