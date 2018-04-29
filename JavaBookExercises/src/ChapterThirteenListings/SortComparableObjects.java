package ChapterThirteenListings;

import java.math.BigInteger;

public class SortComparableObjects {


    public static void main(String[] args) {

        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);

        for (String city: cities)
            System.out.println(city + " ");

        System.out.println();

        BigInteger[] hugeNumbers = { new BigInteger("23232310923992"),
            new BigInteger("432232323239393"),
            new BigInteger("54623239292")};

        java.util.Arrays.sort(hugeNumbers);

        for (BigInteger number: hugeNumbers)
            System.out.print(number + " ");

    }




}
