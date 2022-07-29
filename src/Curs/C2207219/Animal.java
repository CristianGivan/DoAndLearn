package Curs.C2207219;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name=name;
    }
    public abstract void greets();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
