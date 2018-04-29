package ChapterThirteen;

import ChapterThirteenListings.Rational;

public class ThirteenPointEighteen {



    public static void main(String[] args) {

        Rational firstRational = new Rational(1, 2);
        Rational finalRational = firstRational;

        for (int i = 2; i <= 99; i++) {

            Rational nextRational = new Rational(i, i+1);
            finalRational = finalRational.add(nextRational);

        }

        System.out.println(finalRational.toString());


    }


}
