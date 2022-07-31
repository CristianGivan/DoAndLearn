package Teme;

import java.util.Scanner;

public class Teme04 {
    public static void main(String[] args) {
        /*
        Scanner console = new Scanner(System.in);
        int n1, n2;
        System.out.println("Insert the first number: ");
        n1 = console.nextInt();
        System.out.println("Insert the second number: ");
        n2 = console.nextInt();
        System.out.println("The sum of the numbers: " + n1 + " and " + n2 + " is " + sum(n1, n2));
        */
/*

        Scanner console = new Scanner(System.in);
        int numbers;
        System.out.println("Insert the how many number: ");
        numbers = console.nextInt();
        System.out.println(" The smallest number is: " + smallNr(numbers));
*/
        //isEven();
        Scanner console = new Scanner(System.in);
        int numbMonth;
        System.out.println("Insert the month number: ");
        numbMonth = console.nextInt();
        System.out.println("For the month number: " + numbMonth+" the month is "+ monthOfYear(numbMonth));



    }


    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int smallNr(int NNumbers) {
        Scanner console = new Scanner(System.in);
        int n;
        int smallNr = Integer.MAX_VALUE;
        for (int i = 0; i < NNumbers; i++) {
            System.out.println("Insert the number " + (i + 1) + " : ");
            n = console.nextInt();
            smallNr = smalestFromTwoNum(smallNr, n);
        }

        return smallNr;
    }

    public static int smalestFromTwoNum(int n1, int n2) {
        if (n1 <= n2) {
            return n1;
        } else {
            return n2;
        }

    }

    public static void isEven() {
        Scanner console = new Scanner(System.in);
        int number;
        System.out.println("Insert a number: ");
        number = console.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }

    public static String monthOfYear(int numberMonth) {
        String month;

        switch (numberMonth) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month= "Unknown";
                break;

        }
    return month;

    }


}
