package ChapterEight;

import java.util.Scanner;

public class EightPointThirtySeven {

    public static void main(String[] args) {

        String[][] statesCities = {
                    {"Alabama",
                        "Alaska",
                        "Arizona",
                        "Arkansas",
                        "California",
                        "Colorado",
                        "Connecticut",
                        "Delaware",
                        "Florida",
                        "Georgia",
                        "Hawaii",
                        "Idaho",
                        "Illinois",
                        "Indiana",
                        "Iowa",
                        "Kansas",
                        "Kentucky",
                        "Louisiana",
                        "Maine",
                        "Maryland",
                        "Massachusetts",
                        "Michigan",
                        "Minnesota",
                        "Mississippi",
                        "Missouri",
                        "Montana",
                        "Nebraska",
                        "Nevada",
                        "New Hampshire",
                        "New Jersey",
                        "New Mexico",
                        "New York",
                        "North Carolina",
                        "North Dakota",
                        "Ohio",
                        "Oklahoma",
                        "Oregon",
                        "Pennsylvania",
                        "Rhode Island",
                        "South Carolina",
                        "South Dakota",
                        "Tennessee",
                        "Texas",
                        "Utah",
                        "Vermont",
                        "Virginia",
                        "Washington",
                        "West Virginia",
                        "Wisconsin",
                        "Wyoming"},
                {
                    "Montgomery",
                    "Juneau",
                    "Phoenix",
                    "Little Rock",
                    "Sacramento",
                    "Denver",
                    "Hartford",
                    "Dover",
                    "Tallahassee",
                    "Atlanta",
                    "Honolulu",
                    "Boise",
                    "Springfield",
                    "Indianapolis",
                    "Des Moines",
                    "Topeka",
                    "Frankfort",
                    "Baton Rouge",
                    "Augusta",
                    "Annapolis",
                    "Boston",
                    "Lansing",
                    "St. Paul",
                    "Jackson",
                    "Jefferson City",
                    "Helena",
                    "Lincoln",
                    "Carson City",
                    "Concord",
                    "Trenton",
                    "Santa Fe",
                    "Albany",
                    "Raleigh",
                    "Bismarck",
                    "Columbus",
                    "Oklahoma City",
                    "Salem",
                    "Harrisburg",
                    "Providence",
                    "Columbia",
                    "Pierre",
                    "Nashville",
                    "Austin",
                    "Salt Lake City",
                    "Montpelier",
                    "Richmond",
                    "Olympia",
                    "Charleston",
                    "Madison",
                    "Cheyenne"}
        };

        int correctCount = 0;


        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < statesCities[0].length; i++) {

            System.out.print("What is the capital of " + statesCities[0][i] + "? ");
            String input = scanner.next();

            if (input.equals(statesCities[1][i])) {

                System.out.println("Your answer is correct.");
                ++correctCount;

            } else {

                System.out.println("The correct answer should be " + statesCities[1][i]);

            }

        }

        System.out.println("The correct count is " + correctCount);



    }




}
