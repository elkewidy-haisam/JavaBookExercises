package BinaryIOListings;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

            try (

                    ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));

            ) {

                    //Read a String, double value, and object from the file
                    String name = input.readUTF();
                    double score = input.readDouble();
                    java.util.Date date = (java.util.Date)(input.readObject());
                    System.out.println(name + " " + score + " " + date);

            }

    }



}
