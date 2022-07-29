package Curs.C2207219;

public class Dog extends Animal{

    public Dog (String name){
        super(name);
    }
    public void greets(){
        System.out.println("woof");
    }
    public void greets(Dog newDog){
        System.out.println("woof woof"+newDog.getName());
    }
}
