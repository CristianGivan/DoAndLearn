package Curs.C220726;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator.divide(8, 0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
