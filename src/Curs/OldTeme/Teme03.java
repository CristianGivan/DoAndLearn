package Teme;

import java.util.Scanner;

public class Teme03 {
    public static void main(String[] args) {

        initMain(); //initialize with all necessarily one in the main

        //T03M01
/*
        int x = 1;
        int y = 1;

        while (x != -1 || y != -1) {
            System.out.println("Type the first number (-1 to exit the program)");
            x = console.nextInt();
            if (x == -1) {
                System.out.println("You exit the program!");
                break;
            }
            System.out.println("Type the last number (-1 to exit the program)");
            y = console.nextInt();
            if (y == -1) {
                System.out.println("You exit the program!");
                break;
            } else if (x > y) {
                int c;
                c = x;
                x = y;
                y = c;
                System.out.println("The last number is smaller then the first one, but we change it");
                System.out.println("The interval is " + x + " to " + y);

            } else {
                System.out.println("The interval is " + x + " to " + y);
            }
            int mean = 0;
            for (int i = x; i <= y; i++) {

                mean = mean + i;
            }
            mean = mean / (y - x + 1);
            System.out.println("The mean of the consecutive numbers fom " + x + " to " + y + " is " + mean);
        }
        System.out.println("You exit the program!");
        */

        //T03M02
/*
        int x = 1;
        int y = 1;

        while (x != -1 || y != -1) {
            System.out.println("Type the first number (-1 to exit the program)");
            x = console.nextInt();
            if (x == -1) {
                System.out.println("You exit the program!");
                break;
            }
            System.out.println("Type the last number (-1 to exit the program)");
            y = console.nextInt();
            if (y == -1) {
                System.out.println("You exit the program!");
                break;
            } else if (x > y) {
                int c;
                c = x;
                x = y;
                y = c;
                System.out.println("The last number is smaller then the first one, but we change it");
                //System.out.println("The interval is " + x + " to " + y);

            } else {
                //System.out.println("The interval is " + x + " to " + y);
            }
            System.out.println("The numbers divided with 3 and 7 from interval " + x + " to " + y+" is: ");
            for (int i = x; i <= y; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.print(i+"; ");
                }
            }
            System.out.println("\n");
        }
        System.out.println("You exit the program!");*/

        //T03M03
/*
        // Read a number from keyboard
        // Check if the number is valid
        // Check if the number is prime
        // Print the message


        boolean isValid = true;
        int nr;
        //nr = lenghtArray(); //numbers of numbers defined once per run
        while (isValid) {
            nr = lenghtArray();
            //isValid = !is0(nr);
            //System.out.println(nr);
            if (is0(nr)) {
                System.out.println("You had exit the program");
                break;
            }
            //int[][] numsInt ={{1,2,3,4,5,6},{2,3,4,5,6},{3,4,5,6}};
            //printArrayIntLine(numsInt[nr]);
            //int[] numsInt = insertNumbers(nr);
            //printArrayIntLine(numsInt);
            //primNumbersAray(insertNumbers(nr));

            //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 13, 15, 17, 19};
            //printArrayLineInt(primNumbersAray(insertNumbers(nr)));
           // printArrayLineInt(primNumbersAray(array));
*/

        //T03M04
/*
        System.out.println(power(2, 3));
*/

    }


    private static void initMain() {
        Scanner console = new Scanner(System.in);
    }

    private static int lenghtArray() {
        Scanner console = new Scanner(System.in);
        System.out.println("Insert the numbers of numbers (0 to exit the program)");
        return console.nextInt();

    }

    private static int insertInt(int i) {
        Scanner console = new Scanner(System.in);
        if (i == 1) {
            System.out.println("Insert a number ");
            return console.nextInt();
        } else {
            System.out.println("Insert number " + i);
            return console.nextInt();
        }

    }

    private static int[] insertNumbers(int lenght) {

        Scanner console = new Scanner(System.in);
        int[] numbers = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.println("Insert the number " + (i + 1) + "/" + lenght + ":");
            numbers[i] = console.nextInt();
        }

        return numbers;
    }

    private static boolean is0(int nr) {
        if (nr == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printArrayLineInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println("\n");
    }

    private static int[] primNumbersAray(int[] array) {
        int[] prime = new int[array.length];
        int k = -1;
        boolean isPrime = true;

        for (int j = 0; j < array.length; j++) {
            if (array[j] > 3 && array[j] % 2 == 0) {
                isPrime = true;
            } else if (array[j] > 7) {

                for (int i = 3; i < array[j] / 2; i += 2) {
                    if (array[j] % i == 0) {
                        isPrime = false;
                        break;

                    } else {
                        isPrime = true;
                        //k++;
                        //prime[k] = array[j];
                        //System.out.println(array[j]);
                        //break; // fara acest break nu merge corect
                    }

                }
                if (isPrime) {
                    k++;
                    prime[k] = array[j];
                    System.out.println(array[j]);
                }

            } else {
                isPrime = true;
                k++;
                prime[k] = array[j];
                System.out.println(array[j]);

            }


        }
        return prime;
    }

    private static int power(int x, int y) {
        int power = 1;
        //power = x ^ y;
        if (y == 0) {
            power = 1;
        } else if (y == 1) {
            power = x;
        } else {
            for (int i = 0; i < y; i++) {
                power = power * x;

            }
        }
        return power;
    }

}