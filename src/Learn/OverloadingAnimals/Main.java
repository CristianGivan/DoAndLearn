package Learn.OverloadingAnimals;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("dog1");
        Animal dog2 = new Dog("dog2");
        Animal cat1 = new Cat("cat1");
        dog1.greets();
        dog2.greets();
        Dog dogCopy2 = (Dog) dog2;
        Dog dogCopy1 = (Dog) dog1;
        dogCopy1.greets(dogCopy2);
        cat1.greets();
    }
}
