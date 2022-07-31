package CursOld.Objects;

public class Main {
    public static void main(String[] args) {
/*
        Dog dogLabus= new Dog();
         dogLabus.name="Labus";
         dogLabus.bark();
         Dog dogrex=new Dog("Rex1", "black", 6);
        System.out.println("catelul "+dogrex.name+" are culoarea "+ dogrex.color+ " si are " + dogrex.age+ " ani.");
         dogrex.bark();
         */
/*

        Calculator calc1 =new Calculator(2, 3);
        calc1.Suma();
        System.out.println(calc1.Prod(2,3));
*/

        Car car1 = new Car(123);
        car1.brand = "Audi";
        Car car2 = new Car(120);
        car2.brand = "Ford";
        System.out.println("Car type is " + car1.brand + " the max speed is: " + car1.maxSpeed);
        System.out.println("Car type is " + car2.brand + " the max speed is: " + car2.maxSpeed);



    }
}
