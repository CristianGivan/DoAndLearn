package CursOld;

import java.util.Scanner;

public class Curs05 {
    public static void main(String[] args) {


        /**/
        //ComputeLenght();
        //CharAt();
        Scanner console = new Scanner(System.in);
        System.out.println("Insert a text :");
        String text = console.nextLine();
        System.out.println(revesedString(text));

    }

    public static void ComputeLenght() {
        Scanner console = new Scanner(System.in);
        System.out.println("Insert a text :");
        String text = console.nextLine();
        int lenghtTextr = text.length();
        System.out.println("The text inserted is: " + text + "the lenght is : " + lenghtTextr);


    }

    public static void CharAt() {
        Scanner console = new Scanner(System.in);
        System.out.println("Insert a text :");
        String text = console.nextLine();
        System.out.println("Insert the caracter number :");
        int nrChar = console.nextInt();
        char charText = text.charAt(nrChar);
        System.out.println("The text inserted is: " + text + ", the char at position is: " + charText);
    }

    public static String revesedString(String inString) {
        int lenghtInString = inString.length();
        String revString = "";
        for (int i = 0; i < lenghtInString; i++) {
            int nrChar = lenghtInString - 1 - i;
            //System.out.println(nrChar);
            revString = revString + (String.valueOf(inString.charAt(nrChar)));

        }
        return revString;


    }
}
