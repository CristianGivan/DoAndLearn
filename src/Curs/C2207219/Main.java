package Curs.C2207219;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");
        Cat cat1 =new Cat("cat1");
        dog2.greets();
        dog2.greets(dog1);
        cat1.greets();
    }
}
