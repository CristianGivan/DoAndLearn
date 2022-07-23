package Learn.Game;

public class Archer extends PlayerCharacter{
    private int numberOfArrows;
    public Archer(String name, int age, int numberOfArrows){
        super(name, age);
        this.numberOfArrows=numberOfArrows;
    }
    public int getNumberOfArrows(){
        return numberOfArrows;
    }
    public void setNumberOfArrows(int numberOfArrows){
        this.numberOfArrows=numberOfArrows;
    }
    public void attack(){
        System.out.println("Attack with maximum arrows "+this.numberOfArrows);
    }
}
