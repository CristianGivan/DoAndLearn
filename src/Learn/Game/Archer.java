package Learn.Game;

public class Archer extends PlayerCharacter implements Playable{
    private int numberOfArrows;
    public Archer(String name, int age, int numberOfArrows, int currentLevel){
        super(name, age,currentLevel);
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

    @Override
    public void levelUp() {
        this.setCurrentLevel(this.getCurrentLevel()+1);
        this.numberOfArrows+=100;
    }
}
