package ChapterTen;

public class MyStringBuilder1 {


    String s;
    MyStringBuilder1 s1;
    char[] stringCharacters;
    int i;
    int index;
    int begin;
    int end;


    //constructor for StringBuilder
    public MyStringBuilder1(String s) {

        this.s = s;

    }

    //adds another String, that was created via StringBuilder, or maybe even an entirely new StringBuilder, to another StringBuilder
    public MyStringBuilder1 append(MyStringBuilder1 ss) {

        this.s1 = new MyStringBuilder1(s + ss);
        return s1;

    }

    //adds a substring to the overall string
    public MyStringBuilder1 append(int i) {

        String intValue = Integer.toString(i);
        MyStringBuilder1 newString = new MyStringBuilder1(s + intValue);
        this.s1 = newString;

        return s1;

    }

    //returns the length of the string
    public int length() {


        return s1.length();

    }

    /*//finds the character at the predetermined index in the string.
    public char charAt(int index) {



    } */

    //makes every letter in the StringBuilder lowercase.
    /*public MyStringBuilder1 toLowerCase() {




    }  */

    /* public MyStringBuilder1 substring(int begin, int end) {




    } */

    public String toString() {

        return new String();

    }





}
