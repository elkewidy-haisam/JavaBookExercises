package ChapterTwelve;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwelvePointThirtyOne {


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the gender: ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter the name: ");
        String name = scanner.next();


        System.out.println(displayRanking(findFile(year), name, gender));


    }


    public static File findFile(int year) throws Exception{

        String dir = System.getProperty("user.dir");

        File f = new File(dir);
        File acquiredFile = null;

        FilenameFilter textFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        //get their file names, or directories, as Strings and make sure they are being acquired
        File[] files = f.listFiles(textFilter);
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.print("directory: ");
            } else {
                System.out.print("     file: ");
            }
            System.out.println(file.getCanonicalPath());

            if (file.toString().contains(Integer.toString(year))) {

                acquiredFile = file;

            }
        }

        return acquiredFile;

    }

    public static String displayRanking(File file, String name, char gender) throws Exception{

        System.out.println("Displaying ranking for " + name + ", Gender: " + gender);

        Scanner scanner = new Scanner(file);

        int rank = 0;
        String boyName = " ";
        int boyOccurrences = 0;

        String girlName = " ";
        int girlOccurrences = 0;

        String rankStatement = " ";

        while (scanner.hasNext()) {

                rank = scanner.nextInt();

                boyName = scanner.next();
                boyOccurrences = scanner.nextInt();


                girlName = scanner.next();
                girlOccurrences = scanner.nextInt();

            if (boyName.equals(name)) {

                break;

            }
        }

        switch (gender) {

            case 'M': rankStatement = boyName + " is ranked #" + rank + " in year " + file.toString().substring(file.toString().indexOf('2'), file.toString().indexOf('.'));
            break;
            case 'F': rankStatement =  girlName + " is ranked #" + rank + " in year " + file.toString().substring(file.toString().indexOf('2'), file.toString().indexOf('.'));
            break;
            case 'm': rankStatement = boyName + " is ranked #" + rank + " in year " + file.toString().substring(file.toString().indexOf('2'), file.toString().indexOf('.'));
                break;
            case 'f': rankStatement =  girlName + " is ranked #" + rank + " in year " + file.toString().substring(file.toString().indexOf('2'), file.toString().indexOf('.'));
                break;
            default: rankStatement = "Invalid gender";
            break;
        }

        return rankStatement;

    }


}
