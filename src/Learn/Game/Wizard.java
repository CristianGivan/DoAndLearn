package Learn.Game;

public class Wizard extends PlayerCharacter{
    private int power;
    public Wizard(String name, int age, int power){
        super(name, age);
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
}
