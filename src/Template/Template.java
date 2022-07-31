package Template;

import java.util.Random;
import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        //
        Scanner console = new Scanner(System.in);

        int guess = 1;

        while (guess != 0) {
            System.out.println("Type a  number (0 to exit the program)");
                guess = console.nextInt();
        }
        System.out.println("You exit the program!");

        //
        Random random = new Random();
        int answer = random.nextInt(10) + 1;

        //final
    }
}
