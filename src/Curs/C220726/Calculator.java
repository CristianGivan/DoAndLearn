package Curs.C220726;

public class Calculator {
    public static int divide (int firstNumber, int secondNumber) throws ArithmeticException{

        if (secondNumber==0){
            throw new ArithmeticException("you cannot devide by 0");
        }

        int division=firstNumber/secondNumber;
        return division;
    }
}
