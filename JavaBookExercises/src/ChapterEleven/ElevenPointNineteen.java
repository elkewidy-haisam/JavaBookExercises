package ChapterEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class ElevenPointNineteen {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ArrayList for weights of each object
        ArrayList<Integer> objectWeights = new ArrayList<>();

        //counter for containers being created
        int count = 1;


        System.out.print("Enter the number of objects: ");

        int numberOfObjects = scanner.nextInt();

        System.out.print("Enter the weights of the objects: ");

        //add the weights of each object into the ArrayList
        for (int i = 0; i < numberOfObjects; i++) {

            objectWeights.add(scanner.nextInt());

        }

        //start packing objects into bins, displaying the bin number in the process
        for (int i = 0; i < objectWeights.size(); i++) {

            ArrayList<Integer> bin = new ArrayList<>();
            bin.add(objectWeights.get(i));
            int sum = objectWeights.get(i);

            for (int k = 1; k < objectWeights.size(); k++) {

                if (sum + objectWeights.get(k) <= 10) {

                    sum += objectWeights.get(k);
                    bin.add(objectWeights.get(k));
                    objectWeights.remove(k);

                }

                objectWeights.remove(i);

            }

            System.out.print("Container " + count + " contains objects with weight ");

            for (int l = 0; l < bin.size(); l++) {

                System.out.println(bin.get(l) + " ");

            }

            ++count;


        }






    }



}
