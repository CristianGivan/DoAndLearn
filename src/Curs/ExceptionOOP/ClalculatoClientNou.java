package Curs.ExceptionOOP;

public class ClalculatoClientNou {
    public static void main(String[] args) {
       try {
           CalculatorNou.devision(8,0);
       }
       catch (ArithmeticException e){
           System.out.println("Nu se poate face impartirea cu 0 "+e.getMessage());
           e.printStackTrace();
       }

    }
}
