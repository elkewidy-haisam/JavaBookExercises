package ChapterTen;

public class TenPointTwentySix {


    public static void main(String[] args) {

        //check number of Strings passed
        if (args[0].length() % 2 == 0) {

            System.out.println("Usage: Java Calculator operand1 operator operand2");

        }



        //the result of the operation
        int result = 0;

        switch (args[0].charAt(args[0].length() / 2 + 1)) {

            case '+' : result = Integer.parseInt(args[0].substring(0, 1)) + Integer.parseInt(args[0].substring(args[0].length() - 2, args[0].length() - 1));
                break;
            case '-': result = Integer.parseInt(args[0].substring(0, 1)) - Integer.parseInt(args[0].substring(args[0].length() - 2, args[0].length() - 1));
                break;
            case '.': result = Integer.parseInt(args[0].substring(0, 1)) * Integer.parseInt(args[0].substring(args[0].length() - 2, args[0].length() - 1));
                break;
            case '/': result = Integer.parseInt(args[0].substring(0, 1)) / Integer.parseInt(args[0].substring(args[0].length() - 2, args[0].length() - 1));
                break;

        }

        //display the result
        System.out.println(args[0].substring(0, 1) + ' ' + args[0].substring(args[0].length() / 2, args[0].length() / 2 + 1) + ' ' + args[0].substring(args[0].length() - 1, args[0].length()));

    }


}
