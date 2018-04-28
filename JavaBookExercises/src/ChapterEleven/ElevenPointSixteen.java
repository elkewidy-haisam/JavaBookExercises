package ChapterEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class ElevenPointSixteen {

    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        ArrayList<Integer> enteredAnswers = new ArrayList<Integer>();

        //while the two numbers do not add up to the answer inputted
        while (number1 + number2 != answer) {

            //if the answer was previously entered
            if (enteredAnswers.contains(answer)) {

                //display that you already put that answer in
                System.out.println("You already entered " + answer);
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();

            } else {

                //add incorrect answer into the arraylist
                enteredAnswers.add(answer);
                //display that the answer is wrong, and you should try again
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();

            }

        }

        System.out.println("You got it!");

    }

}
