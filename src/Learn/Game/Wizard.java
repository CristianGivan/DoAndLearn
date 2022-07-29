package Learn.Game;

public class Wizard extends PlayerCharacter implements Playable{
    private int power;
    public Wizard(String name, int age, int power, int currentLevel){
        super(name, age, currentLevel);
        this.power=power;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power=power;
    }
    public void attack(){
        System.out.println("Attack with maximum power "+this.power);
    }
    @Override
    public void levelUp() {
        this.setCurrentLevel(this.getCurrentLevel()+1);
        this.power+=50;
    }
}
