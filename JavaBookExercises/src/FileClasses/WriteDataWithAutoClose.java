package FileClasses;

import java.io.File;

public class WriteDataWithAutoClose {



    public static void main(String[] args) throws Exception {

        File file = new File("scores.txt");

        if (file.exists()) {

            System.out.println("File already exists.");
            System.exit(0);

        }

        try (

            //Create a file
            java.io.PrintWriter output = new java.io.PrintWriter(file);

        ) {

            //Write formatted output to the file
            output.print("John T Smith");
            output.print(90);
            output.print("Eric K Jones");
            output.println(85);


        }

    }


}
