package ChapterTwelve;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class TwelvePointThirtyTwo {


    public static void main(String[] args) throws Exception {

        String dir = System.getProperty("user.dir");
        File file = new File(dir);

        System.out.println("_____________________________________________________________________________________________");
        System.out.println("Year   Rank 1   Rank 2   Rank 3   Rank 4   Rank 5  Rank 1   Rank 2   Rank 3   Rank 4   Rank 5");
        System.out.println("_____________________________________________________________________________________________");

        //acquire all files
        //iterate through each file from 2010 to 2001
        //for each file, display names of girls, rank 1 through 5 followed by boys names rank 1 through 5

        FilenameFilter textFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        File[] f = file.listFiles(textFilter);

        for (File files : f) {

            for (int i = 1; i <= 10; i++) {

                if (files.toString().contains(Integer.toString(i))) {

                    Scanner scanner = new Scanner(files);
                   // System.out.println(files.toString());
                   // System.out.println("year: " + i);


                        int lineCounter = 0;

                        String[] boyNames = new String[5];
                        String[] girlNames = new String[5];

                        for (int k = 0; k < 5; k++) {

                            int rank = scanner.nextInt();
                            boyNames[k] = scanner.next();
                            int boyNumbers = scanner.nextInt();

                            girlNames[k] = scanner.next();
                            int girlNumbers = scanner.nextInt();

                            ++lineCounter;

                        }

                        System.out.println(files.toString().substring(files.toString().indexOf("2"), files.toString().indexOf(".")) + "   " + girlNames[0] + "   " + girlNames[1] + "   " + girlNames[2] + "   " + girlNames[3] + "   " + girlNames[4] + "   " + boyNames[0] + "   " + boyNames[1] + "   " + boyNames[2] + "   " + boyNames[3] + "   " + boyNames[4]);

                        if (lineCounter == 5) {

                            break;

                        }


                } else {

                    continue;

                }


            }


        }






    }



}
