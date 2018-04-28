package ChapterTen;

public class Calculator {

    public static void main(String[] args) {

        //check number of Strings passed
        if (args.length != 3) {

            System.out.println("Usage: Java Calculator operand1 operator operand2");
            System.exit(1);

        }

        //The result of the operation
        int result = 0;

        switch (args[1].charAt(0)) {

            case '+' : result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                        break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                        break;
            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;

        }

        //Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

    }


}
