package Template;

import java.io.Console;
import java.util.Scanner;

public class Util {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s;
        do {
            s = console.nextLine();
            stringToByte(s);
        } while (s == "0");
    }

    static public void stringToByte(String s) {

        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + s + "' to binary: " + binary);
    }
}

