package Teme;

import java.util.Random;
import java.util.Scanner;

public class Teme02 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        //T02E01 weekdays
/* int weekday=1;



        while (weekday!=0){
            System.out.println("Introduceti numarul zilei (0 to exit the program)");
            weekday = console.nextInt();

            switch (weekday){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Unknown");
                    break;

            }
        }*/

        // T02E02 factor
/*

        int factor = 1;

        while (factor != 0) {
            System.out.println("Introduceti numarul (0 to exit the program)");
            factor = console.nextInt();
            int rezFactor = 1;
            int cFactor = 1;
            while (cFactor <= factor) {
                rezFactor = rezFactor * cFactor;
                cFactor++;

            }
            System.out.println("Factor of " + factor + " is " + rezFactor);
        }
*/

        //T02E03 sum of the digit of a number
/*        int number = 1;

        //int nDigit;
        //double ndiv;
        //int digit;

        while (number != 0) {
            System.out.println("Introduceti numarul (0 to exit the program)");
            number = console.nextInt();
            int divnumber = number;
            int sumnumber = 0;
            int restnumber = 0;


            // first try :D
            //ndiv = number;
            //nDigit = 0;

            // find the number of digits
            //while (ndiv > 1) {
            //    ndiv = ndiv / 10;
            //    nDigit++;
            //    System.out.println(ndiv + " " + digit + " " + nDigit);

            while (divnumber > 0) {
                restnumber = divnumber % 10;
                sumnumber = sumnumber + restnumber;
                divnumber = divnumber / 10;
                System.out.println("debug: " + sumnumber + "\t" + restnumber + "\t" + divnumber);
            }
            System.out.println("Sum of digits of the number: " + number + " is " + sumnumber);

        }*/

        //T02E04 sum of number divided with 3 and 7 in an interval
/*        int number = 1;

        while (number != 0) {
            System.out.println("Introduceti numarul (0 to exit the program)");
            number = console.nextInt();

            int div3 = 0;
            int div7 = 0;


            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0) {
                    div3 = div3 + i;
                    System.out.println("debug: "+"Number divided with 3 is " +i + "and sum is " + div3);
                }
                if (i % 7 == 0) {
                    div7 = div7 + i;
                    System.out.println("debug: "+"Number divided with 7 is " +i + "and sum is " + div7);
                }
                System.out.println("Suma of numbers divided with 3 are " + div3 + ", sum of numbers divided with 7 are " + div7 + " and in total " + div3 + div7);
            }
        }*/

        //T02E05 finding the number of tryings to find a random number form 1 to 10
/*        int guess = 1;
        Random random = new Random();


        while (guess != 0) {
            int answer = random.nextInt(10) + 1;
            int nrTryes = 0;

            while (guess != answer) {
                System.out.println("Type a  number from 1 to 10 (0 to exit the program)");
                guess = console.nextInt();
                nrTryes++;
                if (guess == 0) {
                    break;
                }

            }
            if (guess == 0) {
                System.out.println("You exit the program");
            } else {
                System.out.println("The number of tries to find the number " + answer + " is " + nrTryes);
            }


        }*/

        //T02E06 string of Fibonacci
/*
        int number = 1;

        while (number != 0) {
            System.out.println("\n Type a  number (0 to exit the program)");
            number = console.nextInt();
            int fnum = 0;
            int fnext = 1;

            for (int i=2; i<number; i++){
                System.out.print(fnum);
                fnum = fnum + fnext;
                fnext = fnum;
            }

        }
        */

        // T02E07 mean of numbers until pres 0
        // !!! nu inteleg de ce imi intra intr-o bucla ifinata daca dau 0
        int number = 1;

        while (number != -1) {
            double meanNr = 0;
            int i = 0;

            while (number != 0) {
                System.out.println("Type a  number (-1 to exit the program)");
                number = console.nextInt();


                if (number != 0) {
                    meanNr = meanNr + number;
                    i++;
                    System.out.println("debug: " + meanNr + "\t" + i);

                } else if (i == 0) {
                    System.out.println("You didn't tried :D");
                } else {

                    System.out.println("The mean of the numbers you typed is: " + meanNr / i);

                }
            }

        }

        // T02E08 draw # depending on input
/*
        int width = 1;
        int height = 1;

        while (width != 0 || height != 0) {
            System.out.println("Type for width (0 to exit the program)");
            width = console.nextInt();
            if (width==0){
                break;
            }
            System.out.println("Type for height (0 to exit the program)");
            height = console.nextInt();
            if (height==0){
                break;
            }
            for(int i=1; i<=height; i++){
                for (int j=0; j<=width; j++){
                    System.out.print("#");
                }
                System.out.println("");
            }

        }*/

        //T02E09 the same as T02E08 only that is n to n matrix of " #" or "# "
/*

        int n = 1;


        while (n != 0) {
            System.out.println("\n \n Type for width (0 to exit the program)");
            n = console.nextInt();
            String pattern;

            for(int i=1; i<=n; i++){

                if (i%2==1) {
                    pattern="# ";
                }else {
                    pattern=" #";
                }
                System.out.println("");
                for (int j=0; j<=n; j++){
                    System.out.print(pattern);

                }
            }

        }
        System.out.println("You exit the program!");
*/

        //final
    }
}
