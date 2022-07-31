package Teme;

import java.util.Scanner;

public class Teme01 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        System.out.println("a initial is: " + a);
//        System.out.println("b initial is: " + b);
//        int c;
//        c = a;
//        a = b;
//        b = c;
//        System.out.println("a final is: " + a);
//        System.out.println("b final is: " + b);
//
//        //mean function
//
//        double x = 4;
//        double y = 3;
//        double z = 1;
//        double mean;
//        mean = (x + y + z) / 3;
//
//        System.out.println("The numbers x, y z are:" + x + ", " + y + ", " + z + ", " + "the mean is :" + mean);
//
//        //Fahrenheit to Celsius
//
//        double tempC;
//        double tempF;
//        tempF = 95;
//        tempC = (tempF - 32) * 0.5556;
//        System.out.println("temperature in fahrenheit is: " + tempF + "temperature converted in celsius is: " + tempC);
//
//        //biggest number
//
//        int bigA, bigB;
//        bigA = 5;
//        bigB = 6;
//
//        if (bigA > bigB) {
//            System.out.println("The biggest number is: " + bigA);
//        } else {
//            System.out.println("The biggest number is: " + bigB);
//        }
//
//        // even/odd number
//
//        int eoNumber;
//        double rest;
//        eoNumber = 10;
//        rest = eoNumber % 2;
//
//        if (rest == 0) {
//            System.out.println("the number: " + eoNumber + " is even");
//
//        } else {
//            System.out.println("the number: " + eoNumber + " is odd");
//        }
//
//        //RO-alert
//
//        String currentForecast;
//        int currentWindSpeed;
//
//        currentForecast = "sunny";
//        currentWindSpeed = 40;
//        if ((currentForecast == "rainy" || currentForecast == "snowing") && (currentWindSpeed > 30)) {
//            System.out.println("Stay in home, it's dangerous outside!");
//        } else {
//            System.out.println("It may be nice outside!");
//        }
//        //fizbuzz
//        int fizzbuzz = 10;
//        int restf, restb;
//        restf = fizzbuzz % 3;
//        restb = fizzbuzz % 5;
//        if (restf == 0 && restb == 0) {
//            System.out.println("fizzbuzz");
//        } else if (restf == 0) {
//            System.out.println("fizz");
//        } else if (restb == 0) {
//            System.out.println("buzz");
//        } else {
//            System.out.println("nofizzbuzz");
//        }
//        int n1, n2, n3;
//        n1 = 3;
//        n2 = 1;
//        n3 = 4;
//        if (n1 == n2 && n2 == n3) {
//            System.out.println("toate numerele sunt egale");
//        } else if (n1 == n2 || n2 == n3 || n3 == n1) {
//            System.out.println("cel putin doua sunt egale");
//        } else {
//            System.out.println("toate numerele sunt diferite");
//        }

//  T1E6 leap year
/*          daca se imparte 4 si la 400 este bisect
//daca se imparte 4 si la 100 si nu la 400 nu este bisect
// daca nu se
//       Scanner console = new Scanner(System.in);
//        int day;
//        System.out.println("Introduceti numarul zilei");
//        day = console.nextInt();
/        Scanner console = new Scanner(System.in);

        int year = 1;
        String typeYear = "Unknown";
        while (year != 0) {
            System.out.println("Insert a number (0 will exit the program)\n");
            year = console.nextInt();


//            if (year%4==0 && year%400==0){
//                typeYear="a leap year";
//            }else if (year%4==0 && year%400!=0 && year!=100){
//                typeYear="a leap year";
//            } else if (year%4==0 && year%400!=0 && year==100) {
//                typeYear="not a leap year";
//            } else if (year%4!=0) {
//                typeYear="not a leap year";
//            }else {
//                typeYear = "Unknown";
//            }

            if (year % 4 != 0) {
                typeYear = "not a leap year";
            } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
                typeYear = "not a leap year";
            } else if (year % 4 == 0 || year % 400 == 0) {
                typeYear="a leap year";
            } else {
                typeYear = "Unknown";
            }
            System.out.println("You inserted year: " + year + " and this year is " + typeYear + "\n");*/

        // T01E06 guess number
        Scanner console = new Scanner(System.in);

        int guess = 7;
        int answer = 8;
        boolean state = true;


        while (state == true) {
            System.out.println("Introduceti numarul estimat");
            guess = console.nextInt();
            if (guess < answer) {
                System.out.println("The number is to small");
            } else if (guess > answer) {
                System.out.println("The number is to big ");
            } else {
                System.out.println("This is the number");
                state = false;
            }
        }


    }
}
