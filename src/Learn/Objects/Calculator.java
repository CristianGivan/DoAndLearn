package CursOld.Objects;
// O clasa calculator care sa faca:
// suma a doua numere


public class Calculator {
    int nr1;
    int nr2;

    Calculator() {

    }

    Calculator(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    void Suma() {
        int sum = this.nr1 + this.nr2;
        System.out.println("Sum of the numbers: " + nr1 + " and " + nr2 + " is " + sum);

    }
    int Prod(int a, int b){
        int prod = a*b;
        return prod;
    }
}
