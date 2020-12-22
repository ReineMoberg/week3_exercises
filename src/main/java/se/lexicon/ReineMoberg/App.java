package se.lexicon.ReineMoberg;


import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        //exercise1();
        //exercise1_2();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        //exercise7();
        //exercise8();
        //exercise9();
        //exercise10();
        //exercise11();
    }

    public static void exercise1() {
        String text = "Java";
        System.out.println(text.length());      //print length of string
    }

    public static void exercise1_2() {
        String text = "Long example sentence";
        System.out.println(text.charAt(6));     //print char at index in string
    }

    public static void exercise2() {
        String text = "Even longer sentence";
        int index = text.indexOf('o');          //get index of 'o'
        System.out.println(index);
    }

    public static void exercise3() {
        String text = "Ok this is not as long!";
        String subString = text.substring(11, 22);  //extract sub string
        System.out.println(subString);
    }

    public static void exercise4() {
        String text = "CAPS EQUALS SCREAMING";
        String lowerCase = text.toLowerCase();      //all lower case
        System.out.println(lowerCase);
        String upperCase = lowerCase.toUpperCase(); //all higher case
        System.out.println(upperCase);
    }

    public static void exercise5() {
        String text = "Java is the worst programming language!";
        String newText = text.replace("worst", "best"); //replacing a word
        System.out.println(newText);
    }

    public static void exercise6() {
        String text = "\tJ\ta\tv\ta\t";
        System.out.println(text);
        System.out.println(text.trim());    //trims beginning and end, not in between
    }

    public static void exercise7() {
        int number = 20;
        String anotherNumber = "20";
        String combinedNumber = anotherNumber.concat(String.valueOf(number));   //adds an int value
        System.out.println(combinedNumber);                                     //at end of a string
    }

    public static void exercise8() {
        String text = "Oil and water";
        String[] textArray = text.split(" and ");   //only store "Oil", "Water" in array
        System.out.println(Arrays.toString(textArray));
    }

    public static void exercise9() {
        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] namesArray = names.split(","); //split string to array at every ","
        for (String name : namesArray) {              //print one name in array at a time
            System.out.println(name);
        }
    }

    public static void exercise10() {
        String text = "ThisShouldBeConverted";
        char[] charArray = text.toCharArray();  //Each letter is stored in array
        for (char letter : charArray) {         //print one letter in array at a time
            System.out.println(letter);
        }
    }

    public static void exercise11() {
        char[] charArray = {'J', 'a', 'v', 'a'};
        String text = String.valueOf(charArray);    //copy char array to a string
        System.out.println(text);
    }

}
