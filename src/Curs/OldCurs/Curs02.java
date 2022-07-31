package CursOld;

import java.util.Scanner;

public class Curs02 {
    public class Main {
        public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int day;
//        System.out.println("Introduceti numarul zilei");
//        day = console.nextInt();
//        System.out.println(day);
//
//        //switch
//
//        switch (day) {
//            case 1:
//                System.out.println("Luni");
//                break;
//            case 2:
//                System.out.println("Marti");
//                break;
//            case 3:
//                System.out.println("Miercuri");
//                break;
//            case 4:
//                System.out.println("Joi");
//                break;
//            case 5:
//                System.out.println("Vineri");
//                break;
//            case 6:
//                System.out.println("Sambata");
//                break;
//            default:
//                System.out.println("Duminica");
//                break;
//        }

            //scrie un program care sa afiseze nr de la 1 la 10

            int n = 1,sum=0;


            while (n <= 10) {
                sum=sum+n;
                n+=1; //1 poate sa fie oricat cu cat sa se c=incrementeze

            }
            System.out.println(sum);


            Scanner console = new Scanner(System.in);


            int N;
            int I=0;
            int Sum=0;
            System.out.println("Alege un numar");
            N = console.nextInt();

            while (I<N){
                if (I%3==0){
                    Sum=Sum+I;

                }
                I++;
            }
            System.out.println(Sum);




//end main
        }
    }
}
