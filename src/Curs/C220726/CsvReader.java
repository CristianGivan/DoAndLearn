package Curs.C220726;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvReader {
    public static void main(String[] args) {
        File file = new File("src/Curs/C220726/sensor_data.csv");
        Scanner scanner= null;
        try {
            scanner = new Scanner(file);
            //citim din fisier

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            scanner.close();
            System.out.println("this code always excepes");
        }

    }
}
