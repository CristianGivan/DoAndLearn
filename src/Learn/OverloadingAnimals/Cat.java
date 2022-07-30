package Learn.OverloadingAnimals;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("miau");
    }

}
