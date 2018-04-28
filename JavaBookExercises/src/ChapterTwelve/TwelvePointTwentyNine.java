package ChapterTwelve;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class TwelvePointTwentyNine {


    public static void main(String[] args) throws IOException {

        //find all files in the directory that contain the name "Exercise"; for now I guess

        String dir = System.getProperty("user.dir");

        File f = new File(dir);


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
            }



        //enhanced for loop
        for (File file: files) {

            StringBuilder filename = new StringBuilder(file.toString());
            String filepathname = file.toString();
            //find length of each filename
            int dotIndex = filepathname.indexOf('.');
            System.out.println("dotIndex: " + dotIndex);

            //find the index of the underscore
            int underscoreIndex = filepathname.indexOf('_');
            System.out.println("underscoreIndex: " + underscoreIndex);

            //if the difference between the length of the string and the index of the underscore is 1, then it's a single digit
            if (dotIndex - underscoreIndex == 2) {

                //if so, insert a 0 at index position before the single digit
                StringBuilder updatedFilename = filename.insert(filepathname.indexOf('_')+1, 0);
                System.out.println("Updated file name: " + updatedFilename);

                File targetFile = new File(filepathname);
                File renamedFile = new File(updatedFilename.toString());

                targetFile.renameTo(renamedFile);



            }

        }

        System.out.println("Reading updated file names.");
        System.out.println("---------------------------");

        //re-run the same loop again to display updated files
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.print("directory: ");
            } else {
                System.out.print("     file: ");
            }
            System.out.println(file.getCanonicalPath());
        }

    }

}
